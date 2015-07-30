package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class BibliotecaParserTest {

    @Test
    public void shouldReturnDisplayBooksObject() {
        BibliotecaParser bibliotecaParser = new BibliotecaParser();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        assertEquals(DisplayBooks.class, bibliotecaParser.parse("1", view, library).getClass());
    }

    @Test
    public void shouldGiveInvalidOptionObject() {
        BibliotecaParser bibliotecaParser = new BibliotecaParser();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        assertEquals(InvalidOption.class, bibliotecaParser.parse("90", view, library).getClass());
    }

    @Test
    public void shouldGiveQuitObject() {
        BibliotecaParser bibliotecaParser = new BibliotecaParser();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        assertEquals(Quit.class, bibliotecaParser.parse("0", view, library).getClass());
    }

    @Test
    public void shouldGiveCheckoutObject() {
        BibliotecaParser bibliotecaParser = new BibliotecaParser();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        assertEquals(CheckOut.class, bibliotecaParser.parse("2", view, library).getClass());
    }

    @Test
    public void shouldGiveCheckInObject() {
        BibliotecaParser bibliotecaParser = new BibliotecaParser();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        assertEquals(CheckIn.class, bibliotecaParser.parse("3", view, library).getClass());
    }
}