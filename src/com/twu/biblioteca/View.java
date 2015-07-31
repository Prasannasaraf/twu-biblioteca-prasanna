package com.twu.biblioteca;

import java.util.Scanner;


//Displays To console
public class View {

    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayListOfBooks(Library library) {
        System.out.println("List of Books");
        System.out.printf("%-15s %-15s %-5s\n", "Name", "Author", "Year");
        for (Book book : library.getBooks()) {
            System.out.printf("%-15s %-15s %-5s\n", book.getTitle(), book.getAuthor(), book.getYear());
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
        System.out.println("\n\t\tMenu\n" +
                "[0] Quit\n" +
                "[1] List Books\n" +
                "[2] Checkout Book\n" +
                "[3] CheckIn Book\n" +
                "Enter Your Option :");
    }

    public void displaySuccessfulCheckout() {
        System.out.println("Thank you! Enjoy the book");
    }

    public void displayUnSuccessfulCheckout() {
        System.out.println("That book is not available.");
    }

    public void displaySuccessfulCheckIn() {
        System.out.println("Thank you for returning the book.");
    }

    public void displayUnSuccessfulCheckIn() {
        System.out.println("That is not a valid book to return.");
    }
}