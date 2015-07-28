package com.twu.biblioteca;

public class View {
    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayListOfBooks(BookList booklist) {
        for (Book book : booklist.getBooks()) {
            System.out.println(book.getName());
        }
    }
}
