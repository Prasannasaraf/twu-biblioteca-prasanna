package com.twu.biblioteca.controller;

import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class IncorrectLoginTest {

    @Test
    public void shouldCallShowForIncorrectDisplay() {
        View view = mock(View.class);

        verify(view).show(Messages.errLogin);
    }
}