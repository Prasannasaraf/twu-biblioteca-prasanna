package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.*;
import com.twu.biblioteca.presentation.View;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaParserTest {

    Library moviesLibrary;
    BibliotecaParser bibliotecaParser;
    View view;
    Library library;
    User user;
    Login login;

    @Before
    public void setUp() {
        bibliotecaParser = new BibliotecaParser();
        view = mock(View.class);
        library = mock(Library.class);
        moviesLibrary = mock(Library.class);
        user = mock(User.class);
        login = mock(Login.class);
    }

    @Test
    public void shouldGiveQuitObject() {
        assertEquals(Quit.class, bibliotecaParser.parse("0", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldReturnDisplayBooksObject() {
        assertEquals(Display.class, bibliotecaParser.parse("1", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveCheckoutObject() {
        assertEquals(CheckOut.class, bibliotecaParser.parse("2", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveCheckInObject() {
        assertEquals(CheckIn.class, bibliotecaParser.parse("3", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldReturnDisplayMoviesObject() {
        assertEquals(Display.class, bibliotecaParser.parse("4", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveCheckoutObjectOn5AsInput() {
        assertEquals(CheckOut.class, bibliotecaParser.parse("5", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveCheckInObjectOn6AsInput() {
        assertEquals(CheckIn.class, bibliotecaParser.parse("6", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveDisplayUserInformationObjectOn7AsInput() {
        assertEquals(DisplayUserInformation.class, bibliotecaParser.parse("7", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveDisplayCheckOutListObjectOn8AsInput() {
        when(user.isLibrarian()).thenReturn(true);

        assertEquals(DisplayCheckedOutList.class, bibliotecaParser.parse("8", view, library, moviesLibrary, user, login).getClass());
    }

    @Test
    public void shouldGiveInvalidOptionObject() {
        assertEquals(InvalidOption.class, bibliotecaParser.parse("90", view, library, moviesLibrary, user, login).getClass());
    }
}