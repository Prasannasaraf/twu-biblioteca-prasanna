package com.twu.biblioteca;

import java.util.ArrayList;


//Library can have  Books or Movies.
public class Library {
    private  ArrayList<Item> items;
    private  ArrayList<Item> checkedOutItems;

    public Library(ArrayList<Item> items, ArrayList<Item> checkedOutItems) {
        this.items = items;
        this.checkedOutItems = checkedOutItems;
    }

    public  ArrayList<Item> getItems() {
        return items;
    }

    public boolean checkOutItem(String itemName) {
        for (Item item : items) {
            if (item.hasTitle(itemName)) {
                items.remove(item);
                checkedOutItems.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean checkInItem(String itemName) {
        for (Item item : checkedOutItems) {
            if (item.hasTitle(itemName)) {
                checkedOutItems.remove(item);
                items.add(item);
                return true;
            }
        }
        return false;
    }
}