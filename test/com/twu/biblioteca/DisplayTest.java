package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DisplayTest {
    @Test
    public void shouldCallDisplayBooks() {
        View view = mock(View.class);
        Library library = mock(Library.class);
        Display display = new Display(view, library);

        display.execute();

        verify(view).displayListOfItems(library);
    }
}