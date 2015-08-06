package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;

//Returns Domain Objects
public class BibliotecaParser {
    public Operations parse(String userInput, View view, Library bookLibrary, Library moviesLibrary, User user, Login login) {
        switch (userInput) {
            case "0":
                return new Quit();
            case "1":
                return new Display(view, bookLibrary.getItems(), Messages.listOfBooks, Messages.booksHeader);
            case "2":
                return new CheckOut(view, bookLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut, user);
            case "3":
                return new CheckIn(view, bookLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn, user);
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
                    return new DisplayCheckedOutList(view, bookLibrary.getCheckedOutItems(), Messages.listOfCheckedOutBooks, Messages.checkedOutBooksHeader);
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

    public Operations parse(View view, Library bookLibrary, Library moviesLibrary, User user, Login login) {
        if (user == null) {
            return new IncorrectLogin(view);
        }
        if (user.isLibrarian()) {
            return new UserController(view, bookLibrary, moviesLibrary, user, this, login, Messages.librarianMenu);
        } else {
            return new UserController(view, bookLibrary, moviesLibrary, user, this, login, Messages.userMenu);
        }
    }

    public Operations parse(String input, View view, Library bookLibrary, Library moviesLibrary, BibliotecaParser parser, ArrayList<User> users) {
        switch (input) {
            case "0":
                return new Quit();
            case "1":
                return new Login(users, view, parser, bookLibrary, moviesLibrary);
            default:
                return new InvalidOption(view);
        }
    }

}