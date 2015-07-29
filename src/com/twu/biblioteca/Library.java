package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
