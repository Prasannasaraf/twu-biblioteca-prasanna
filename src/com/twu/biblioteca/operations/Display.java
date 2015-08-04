package com.twu.biblioteca.operations;


import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import com.twu.biblioteca.model.Item;

import java.util.ArrayList;

//Displays List of Books
public class Display implements Operations {
    private final View view;
    private final ArrayList<Item> items;
    private final Messages listOfItems;
    private final Messages itemHeader;

    public Display(View view, ArrayList<Item> items, Messages listOfItems, Messages itemHeader) {
        this.view = view;
        this.items = items;
        this.listOfItems = listOfItems;
        this.itemHeader = itemHeader;
    }

    @Override
    public void execute() {
        view.displayListOfItems(items, listOfItems, itemHeader);
    }
}
