package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.HashMap;

public class DisplayCheckedOutList implements Operations {
    private final View view;
    private final HashMap<Item, String> checkedOutItems;
    private final Messages listOfItems;
    private final Messages itemHeader;

    public DisplayCheckedOutList(View view, HashMap<Item, String> checkedOutItems, Messages listOfItems, Messages itemHeader) {
        this.view = view;
        this.checkedOutItems = checkedOutItems;
        this.listOfItems = listOfItems;
        this.itemHeader = itemHeader;
    }

    @Override
    public void execute() {
        view.displayCheckedOutList(checkedOutItems, listOfItems, itemHeader);
    }
}