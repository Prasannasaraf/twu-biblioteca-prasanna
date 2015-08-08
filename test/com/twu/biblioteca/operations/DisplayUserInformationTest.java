package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class DisplayUserInformationTest {

    @Test
    public void ShouldCallShowUserInformation() {
        View view = mock(View.class);
        User user = mock(User.class);
        DisplayUserInformation displayUserInformation = new DisplayUserInformation(view, user);

        displayUserInformation.execute();

        verify(view).showUserInformation(user);
    }
}