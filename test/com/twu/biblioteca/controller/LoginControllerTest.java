package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class LoginControllerTest {

    private Login login;
    private BibliotecaParser parser;
    private User user;
    private UserController userController;
    private LoginController loginController;

    @Before
    public void setUp() throws Exception {
        login = mock(Login.class);
        parser = mock(BibliotecaParser.class);
        user = mock(User.class);
        userController = mock(UserController.class);
        loginController = new LoginController(parser, login);
    }

    @Test
    public void shouldCallUserControllerExecute() {
        when(parser.parse(user)).thenReturn(userController);
        when(login.authenticate()).thenReturn(user);
        loginController.execute();

        verify(userController).execute();
    }
}