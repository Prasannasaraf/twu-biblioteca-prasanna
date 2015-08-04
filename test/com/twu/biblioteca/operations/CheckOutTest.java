package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.operations.CheckOut;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckOutTest {

    @Test
    public void checkOutShouldCallCheckOutBook() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckOut checkOut = new CheckOut(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut);

        when(mockedView.getInput()).thenReturn("Success");
        checkOut.execute();

        verify(mockedLibrary).checkOutItem("Success");
    }

    @Test
    public void checkOutShouldCallDisplaySuccessfulCheckout() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckOut checkOut = new CheckOut(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut);

        when(mockedLibrary.checkOutItem("Success")).thenReturn(true);
        when(mockedView.getInput()).thenReturn("Success");
        checkOut.execute();

        verify(mockedView).show(Messages.successfulBookCheckout);
    }

    @Test
    public void checkOutShouldCallDisplayUnSuccessfulCheckout() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckOut checkOut = new CheckOut(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckout, Messages.unsuccessfulBookCheckOut);

        when(mockedLibrary.checkOutItem("SuccessFactor")).thenReturn(false);
        when(mockedView.getInput()).thenReturn("SuccessFactor");
        checkOut.execute();

        verify(mockedView).show(Messages.unsuccessfulBookCheckOut);
    }
}