package com.twu.biblioteca.operations;

import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class IncorrectLoginControllerTest {

    @Test
    public void shouldCallShowForIncorrectDisplay() {
        View view = mock(View.class);

        IncorrectLogin incorrectLogin = new IncorrectLogin(view);
        incorrectLogin.execute();

        verify(view).show(Messages.errLogin);
    }
}