package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


//Returns Domain Objects
public class BibliotecaParser {
    private final View view;
    private final Library booksLibrary;
    private final Library moviesLibrary;
    private final Login login;

    public BibliotecaParser(View view, Library booksLibrary, Library moviesLibrary, Login login) {
        this.view = view;
        this.booksLibrary = booksLibrary;
        this.moviesLibrary = moviesLibrary;
        this.login = login;
    }

    public Operations parse(String userInput, User user) {
        switch (userInput) {
            case "0":
                return new Quit();
            case "1":
                return new Display(view, booksLibrary.getItems(), Messages.listOfBooks, Messages.booksHeader);
            case "2":
                return new CheckOut(view, booksLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut, user);
            case "3":
                return new CheckIn(view, booksLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn, user);
            case "4":
                return new Display(view, moviesLibrary.getItems(), Messages.listOfMovies, Messages.moviesHeader);
            case "5":
                return new CheckOut(view, moviesLibrary, Messages.enterMovieName, Messages.successfulMovieCheckout, Messages.unsuccessfulMovieCheckOut, user);
            case "6":
                return new CheckIn(view, moviesLibrary, Messages.enterMovieName, Messages.successfulMovieCheckIn, Messages.unsuccessfulMovieCheckIn, user);
            case "7":
                return new DisplayUserInformation(view, user);
            case "8":
                if (user.isLibrarian())
                    return new DisplayCheckedOutList(view, booksLibrary.getCheckedOutItems(), Messages.listOfCheckedOutBooks, Messages.checkedOutBooksHeader);
                return new NullObject();
            case "9":
                if (user.isLibrarian())
                    return new DisplayCheckedOutList(view, moviesLibrary.getCheckedOutItems(), Messages.listOfCheckedOutMovies, Messages.checkedOutMoviesHeader);
            case "10":
                if (user.isLibrarian())
                    return new DisplayListOfUsers(view, login.getUsers(), Messages.listOfUsers, Messages.userHeader);
            case "11":
                if (user.isLibrarian())
                    return new NullObject();
            default:
                return new InvalidOption(view);
        }
    }

    public Operations parse(User user) {
        if (user == null) {
            return new IncorrectLogin(view);
        }
        if (user.isLibrarian()) {
            return new UserController(view, user, this, Messages.librarianMenu);
        } else {
            return new UserController(view, user, this, Messages.userMenu);
        }
    }

    public Operations parse(String input) {
        switch (input) {
            case "0":
                return new Quit();
            case "1":
                return new LoginController(this, login);
            default:
                return new InvalidOption(view);
        }
    }

}