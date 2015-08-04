package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.Display;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DisplayTest {
    @Test
    public void shouldCallDisplayBooks() {
        View view = mock(View.class);
        Library library = mock(Library.class);
        Display display = new Display(view, library.getItems(), Messages.listOfBooks, Messages.booksHeader);

        display.execute();

        verify(view).displayListOfItems(library.getItems(), Messages.listOfBooks, Messages.booksHeader);
    }
}