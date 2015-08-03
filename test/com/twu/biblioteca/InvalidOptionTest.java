package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class InvalidOptionTest {

    @Test
    public void showCallInvalidOption() {
        View view = mock(View.class);
        InvalidOption invalidOption = new InvalidOption(view);

        invalidOption.execute();
        verify(view).show(Messages.invalidOption);
    }
}