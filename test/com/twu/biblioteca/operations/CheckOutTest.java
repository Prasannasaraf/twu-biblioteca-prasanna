package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckOutTest {

    User user;
    Library mockedLibrary;
    View mockedView;
    CheckOut checkOut;

    @Before
    public void setUp() throws Exception {
        mockedLibrary = mock(Library.class);
        mockedView = mock(View.class);
        user = mock(User.class);
        checkOut = new CheckOut(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut, user);
        when(user.getName()).thenReturn("Ram");
    }

    @Test
    public void checkOutShouldCallCheckOutBook() {
        when(mockedView.getInput()).thenReturn("Success");
        checkOut.execute();

        verify(mockedLibrary).checkOutItem(user.getName(), "Success");
    }

    @Test
    public void checkOutShouldCallDisplaySuccessfulCheckout() {
        when(mockedLibrary.checkOutItem(user.getName(), "Success")).thenReturn(true);
        when(mockedView.getInput()).thenReturn("Success");
        checkOut.execute();

        verify(mockedView).show(Messages.successfulBookCheckout);
    }

    @Test
    public void checkOutShouldCallDisplayUnSuccessfulCheckout() {
        when(mockedLibrary.checkOutItem(user.getName(), "SuccessFactor")).thenReturn(false);
        when(mockedView.getInput()).thenReturn("SuccessFactor");
        checkOut.execute();

        verify(mockedView).show(Messages.unsuccessfulBookCheckOut);
    }
}