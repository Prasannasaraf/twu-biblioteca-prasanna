package com.twu.biblioteca;


//Returns Domain Objects
public class BibliotecaParser {
    public Operations parse(String userInput, View view, Library bookLibrary, Library moviesLibrary) {
        switch (userInput) {
            case "0":
                return new Quit();
            case "1":
                return new Display(view, bookLibrary);
            case "2":
                return new CheckOut(view, bookLibrary);
            case "3":
                return new CheckIn(view, bookLibrary);
            case "4":
                return new Display(view, moviesLibrary);
            case "5":
                return new CheckOut(view, moviesLibrary);
            case "6":
                return new CheckIn(view, moviesLibrary);
            default:
                return new InvalidOption(view);
        }
    }
}