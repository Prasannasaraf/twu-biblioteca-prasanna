package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BibliotecaControllerTest {

    @Test
    public void menuShouldCallDisplayListOfBooks() {
        View mockedView = mock(View.class);
        Library mockedLibrary = mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(mockedView,mockedLibrary);

        when(mockedView.getInput()).thenReturn("1").thenReturn("2");
        bibliotecaController.start();

        verify(mockedView).displayListOfBooks(mockedLibrary);
    }
}