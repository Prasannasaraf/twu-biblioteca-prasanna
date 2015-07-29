package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library() {
        books  = new ArrayList<Book>();
        books.add(new Book("Red Jhon", "Martin", "2004"));
        books.add(new Book("Success", "Ricky", "1994"));
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
