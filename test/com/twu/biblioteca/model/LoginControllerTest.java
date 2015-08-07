package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.BibliotecaParser;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class LoginControllerTest {

    @Test
    public void shouldGiveTheUserObject() {
        View view = mock(View.class);
        BibliotecaParser parser = mock(BibliotecaParser.class);
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam", true);
        User user2 = new User("Laxman", "laxmanrasad@twu.com", "916", "765-4321", "laxMan", true);
        users.add(user1);
        users.add(user2);
        LoginController loginController = new LoginController(users, view, parser);

        when(view.getInput()).thenReturn("123-4567").thenReturn("ramRam");
        assertEquals(user1, loginController.authenticate());
    }
}