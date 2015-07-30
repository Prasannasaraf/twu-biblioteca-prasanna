package com.twu.biblioteca;

import java.util.ArrayList;


//Library has Books.
public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Book> checkedoutBooks;
    public Library(ArrayList<Book> books,ArrayList<Book> checkedoutBooks) {
        this.books = books;
        this.checkedoutBooks = checkedoutBooks;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public boolean checkOutBook(String Bookname) {
        for (Book book : books) {
            if (book.getName().equals(Bookname)) {
                books.remove(book);
                checkedoutBooks.add(book);
                return true;
            }
        }
        return false;
    }

    public boolean checkInBook(String Bookname) {
        for (Book book : checkedoutBooks) {
            if (book.getName().equals(Bookname)) {
                checkedoutBooks.remove(book);
                books.add(book);
                return true;
            }
        }
        return false;
    }
}