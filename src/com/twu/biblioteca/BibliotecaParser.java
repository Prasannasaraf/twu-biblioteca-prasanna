package com.twu.biblioteca;


//Returns Domain Objects
public class BibliotecaParser {
    public Operations parse(String userInput, View view, Library bookLibrary, Library moviesLibrary) {
        switch (userInput) {
            case "0":
                return new Quit();
            case "1":
                return new Display(view, bookLibrary.getItems(), Messages.listOfBooks, Messages.booksHeader);
            case "2":
                return new Display(view, bookLibrary.getCheckedOutItems(), Messages.listOfCheckedOutBooks, Messages.booksHeader);
            case "3":
                return new CheckOut(view, bookLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut);
            case "4":
                return new CheckIn(view, bookLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn);
            case "5":
                return new Display(view, moviesLibrary.getItems(), Messages.listOfMovies, Messages.moviesHeader);
            case "6":
                return new Display(view, moviesLibrary.getCheckedOutItems(), Messages.listOfCheckedOutMovies, Messages.moviesHeader);
            case "7":
                return new CheckOut(view, moviesLibrary, Messages.enterMovieName, Messages.successfulMovieCheckout, Messages.unsuccessfulMovieCheckOut);
            case "8":
                return new CheckIn(view, moviesLibrary, Messages.enterMovieName, Messages.successfulMovieCheckIn, Messages.unsuccessfulMovieCheckIn);
            default:
                return new InvalidOption(view);
        }
    }
}