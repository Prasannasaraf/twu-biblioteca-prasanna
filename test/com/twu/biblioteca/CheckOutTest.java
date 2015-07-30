package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckOutTest {
    @Test
    public void checkOutShouldCallCheckOutBook() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckOut checkOut = new CheckOut(mockedView,mockedLibrary);

        when(mockedView.getInput()).thenReturn("Success");
        checkOut.execute();
        verify(mockedLibrary).checkOutBook("Success");
    }
}