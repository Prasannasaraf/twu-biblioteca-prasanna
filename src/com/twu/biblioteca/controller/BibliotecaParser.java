package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

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
                return new DisplayCheckedOutList(view, bookLibrary.getCheckedOutItems(), Messages.listOfCheckedOutBooks, Messages.checkedOutBooksHeader);
            default:
                return new InvalidOption(view);
        }
    }
}