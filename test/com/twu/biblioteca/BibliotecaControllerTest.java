package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaControllerTest {
    View mockedView;
    Library mockedLibrary;
    BibliotecaController bibliotecaController;

    @Before
    public void setUp() throws Exception {
        mockedView = mock(View.class);
        mockedLibrary = mock(Library.class);
        bibliotecaController = new BibliotecaController(mockedView, mockedLibrary);

    }

    @Test
    public void menuShouldCallDisplayListOfBooks() {
        when(mockedView.getInput()).thenReturn("1").thenReturn("0");
        bibliotecaController.start();

        verify(mockedView).displayListOfBooks(mockedLibrary);
    }

    @Test
    public void menuShouldDisplayInvalidOption() {
        when(mockedView.getInput()).thenReturn("3").thenReturn("0");
        bibliotecaController.start();

        verify(mockedView).displayInvalidOption();
    }

    @Test
    public void menuShouldRemoveBooks() {
        when(mockedView.getInput()).thenReturn("2").thenReturn("Success").thenReturn("0");
        bibliotecaController.start();

        verify(mockedLibrary).removeBook("Success");
    }
}