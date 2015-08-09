package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.DisplayListOfUsers;
import com.twu.biblioteca.operations.NullObject;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class UserControllerTest {

    private View view;
    private User user;
    private BibliotecaParser parser;
    private DisplayListOfUsers displayUserList;
    private NullObject nullObject;

    @Before
    public void setUp() throws Exception {
        view = mock(View.class);
        user = mock(User.class);
        parser = mock(BibliotecaParser.class);
        displayUserList = mock(DisplayListOfUsers.class);
        nullObject = mock(NullObject.class);
    }

    @Test
    public void shouldCallNullObjectForInput11WhenUserIsALibrarian() {
        UserController userController = new UserController(view, user, parser, Messages.librarianMenu);

        when(user.isLibrarian()).thenReturn(true);
        when(view.getInput()).thenReturn("10").thenReturn("11");
        when(parser.parse("10", user)).thenReturn(displayUserList);
        when(parser.parse("11", user)).thenReturn(nullObject);
        userController.execute();

        verify(displayUserList).execute();
    }
}