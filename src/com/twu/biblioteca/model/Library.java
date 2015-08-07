package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.HashMap;


//Library can have  Books or Movies.
public class Library {

    private final ArrayList<Item> items;
    private final HashMap<Item, String> checkedOutItems;

    public Library(ArrayList<Item> items, HashMap<Item, String> checkedOutItems) {
        this.items = items;
        this.checkedOutItems = checkedOutItems;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public HashMap<Item, String> getCheckedOutItems() {
        return checkedOutItems;
    }

    public boolean checkOutItem(String user, String itemName) {
        for (Item item : items) {
            if (item.hasTitle(itemName)) {
                items.remove(item);
                checkedOutItems.put(item, user);
                return true;
            }
        }
        return false;
    }

    public boolean checkInItem(String user, String itemName) {
        for (Item item : checkedOutItems.keySet()) {
            if (item.hasTitle(itemName) && user.equals(checkedOutItems.get(item))) {
                checkedOutItems.remove(item);
                items.add(item);
                return true;
            }
        }
        return false;
    }
}