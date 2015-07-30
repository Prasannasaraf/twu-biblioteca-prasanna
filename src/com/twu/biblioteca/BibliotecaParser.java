package com.twu.biblioteca;

public class BibliotecaParser {
    public Operations parse(String userInput, View view, Library library) {
        switch (userInput) {
            case "0":
                return new Quit();
            case "1":
                return new DisplayBooks(view,library);
            case "2":
                return new CheckOut(view,library);
            case "3":
                return new CheckIn(view,library);
            default:
                return new InvalidOption(view);
        }
    }
}