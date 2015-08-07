package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DisplayListOfUsersTest {

    @Test
    public void shouldCallDisplayListOfUsers() {
        View view = mock(View.class);
        ArrayList<User> users = mock(ArrayList.class);

        DisplayListOfUsers displayListOfUsers = new DisplayListOfUsers(view, users, Messages.listOfUsers, Messages.userHeader);
        displayListOfUsers.execute();

        verify(view).displayListOfUsers(users, Messages.listOfUsers, Messages.userHeader);
    }
}