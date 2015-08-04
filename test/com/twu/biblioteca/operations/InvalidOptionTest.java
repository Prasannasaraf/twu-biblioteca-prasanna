package com.twu.biblioteca.operations;

import com.twu.biblioteca.operations.InvalidOption;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
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