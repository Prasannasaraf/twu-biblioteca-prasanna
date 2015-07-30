package com.twu.biblioteca;

public class BibliotecaParser {
    public Operations parse(String userInput, View view, Library library) {
        switch (userInput) {
            case "1":
                return new DisplayBooks(view,library);
        }
        return null;
    }
}