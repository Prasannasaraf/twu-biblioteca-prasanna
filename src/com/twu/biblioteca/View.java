package com.twu.biblioteca;

public class View {
    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayListOfBooks(Library library) {
        System.out.println("List of Books");
        System.out.printf("%-15s %-15s %-5s\n","Name","Author","Year");
        for (Book book : library.getBooks()) {
            System.out.printf("%-15s %-15s %-5s\n",book.getName(),book.getAuthor(),book.getYear());
        }
    }
}
