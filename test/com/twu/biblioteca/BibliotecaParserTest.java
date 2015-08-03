package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class BibliotecaParserTest {

    Library moviesLibrary;
    BibliotecaParser bibliotecaParser;
    View view;
    Library library;

    @Before
    public void setUp() {
        bibliotecaParser = new BibliotecaParser();
        view = Mockito.mock(View.class);
        library = Mockito.mock(Library.class);
        moviesLibrary = Mockito.mock(Library.class);
    }

    @Test
    public void shouldReturnDisplayBooksObject() {
        assertEquals(Display.class, bibliotecaParser.parse("1", view, library, moviesLibrary).getClass());
    }
    @Test
    public void shouldReturnDisplayMoviesObject() {
        assertEquals(Display.class, bibliotecaParser.parse("4", view, library, moviesLibrary).getClass());
    }

    @Test
    public void shouldGiveInvalidOptionObject() {
        assertEquals(InvalidOption.class, bibliotecaParser.parse("90", view, library, moviesLibrary).getClass());
    }

    @Test
    public void shouldGiveQuitObject() {
        assertEquals(Quit.class, bibliotecaParser.parse("0", view, library, moviesLibrary).getClass());
    }

    @Test
    public void shouldGiveCheckoutObject() {
        assertEquals(CheckOut.class, bibliotecaParser.parse("2", view, library, moviesLibrary).getClass());
    }

    @Test
    public void shouldGiveCheckInObject() {
        assertEquals(CheckIn.class, bibliotecaParser.parse("3", view, library, moviesLibrary).getClass());
    }
}