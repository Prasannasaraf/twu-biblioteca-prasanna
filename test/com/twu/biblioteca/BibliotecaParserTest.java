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
}