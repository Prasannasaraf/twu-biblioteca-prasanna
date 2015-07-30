package com.twu.biblioteca;

import java.util.ArrayList;


//Library has Books.
public class Library {
    private static ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public void removeBook(String Bookname) {
        for (Book book : books) {
            if (book.getName().equals(Bookname)) {
                books.remove(book);
                break;
            }
        }
    }
}