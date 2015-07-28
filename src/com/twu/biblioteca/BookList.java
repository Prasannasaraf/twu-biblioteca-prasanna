package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {
    private static ArrayList<Book> books;

    public BookList() {
        books  = new ArrayList<Book>();
        books.add(new Book("Red Jhon"));
        books.add(new Book("Success"));
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
