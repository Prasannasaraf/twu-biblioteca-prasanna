package com.twu.biblioteca;

import java.util.Scanner;


//Displays To console
public class View {

    public void show(Messages messages) {
        System.out.println(messages.getMessage());
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayListOfItems(Library library) {
        System.out.println("List of Books");
        System.out.printf("%-15s %-15s %-5s\n", "Name", "Author", "Year");
        for (Item item : library.getItems()) {
            System.out.println(item);
        }
    }
}