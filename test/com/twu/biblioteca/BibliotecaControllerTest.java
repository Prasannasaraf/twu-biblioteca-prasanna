package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaControllerTest {

    @Test
    public void menuShouldCallDisplayListOfBooks() {
        View mockedView = mock(View.class);
        Library mockedBookList = mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(mockedView,mockedBookList);

        bibliotecaController.start();

        verify(mockedView).displayListOfBooks(mockedBookList);
    }
}