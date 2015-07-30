package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DisplayBooksTest {
    @Test
    public void shouldCallDisplayBooks() {
        View view = mock(View.class);
        Library library = mock(Library.class);
        DisplayBooks displayBooks = new DisplayBooks(view, library);

        displayBooks.execute();

        verify(view).displayListOfBooks(library);
    }
}