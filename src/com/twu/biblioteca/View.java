package com.twu.biblioteca;

import java.util.ArrayList;
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

    public void displayListOfItems(ArrayList<Item> items, Messages listOfItems, Messages itemHeader) {
        System.out.println(listOfItems.getMessage());
        System.out.print(itemHeader.getMessage());
        for (Item item : items) {
            System.out.println(item);
        }
    }
}