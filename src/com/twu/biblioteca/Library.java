package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books;

    public Library(Book book1,Book book2) {
        books  = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }
}
