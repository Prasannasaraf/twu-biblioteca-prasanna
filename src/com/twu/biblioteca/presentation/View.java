package com.twu.biblioteca.presentation;

import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.HashMap;
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

    public void showUserInformation(User user) {
        System.out.println(user);
    }

    public void displayCheckedOutList(HashMap<Item, String> checkedOutItems, Messages listOfItems, Messages itemHeader) {
        System.out.println(listOfItems.getMessage());
        System.out.print(itemHeader.getMessage());
        for (Item item : checkedOutItems.keySet()) {
            System.out.println(item + " " + checkedOutItems.get(item));
        }
    }

    public void displayListOfUsers(ArrayList<User> users, Messages listOfUsers, Messages userHeader) {
        System.out.println(listOfUsers.getMessage());
        System.out.println(userHeader.getMessage());
        for (User user : users) {
            System.out.println(user);
        }
    }
}