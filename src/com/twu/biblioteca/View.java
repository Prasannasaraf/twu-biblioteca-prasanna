package com.twu.biblioteca;

import java.util.Scanner;

public class View {

    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayListOfBooks(Library library) {
        System.out.println("List of Books");
        System.out.printf("%-15s %-15s %-5s\n", "Name", "Author", "Year");
        for (Book book : library.getBooks()) {
            System.out.printf("%-15s %-15s %-5s\n", book.getName(), book.getAuthor(), book.getYear());
        }
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayInvalidOption() {
        System.out.println("Select a valid option!");
    }

    public void displayMenu() {
        System.out.println("[0] Quit");
        System.out.println("[1] List Books");
        System.out.println("[2] Checkout Book");
    }

    public void displaySuccessfulCheckout() {
        System.out.println("Thank you! Enjoy the book");
    }
}
