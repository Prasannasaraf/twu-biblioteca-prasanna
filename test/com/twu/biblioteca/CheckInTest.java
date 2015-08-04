package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckInTest {

    @Test
    public void checkInShouldCallCheckInBook() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckIn checkIn = new CheckIn(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn);

        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedLibrary).checkInItem("Success");
    }

    @Test
    public void checkInShouldCallDisplaySuccessfulCheckout() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckIn checkIn = new CheckIn(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn);

        when(mockedLibrary.checkInItem("Success")).thenReturn(true);
        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedView).show(Messages.successfulBookCheckIn);
    }

    @Test
    public void checkInShouldCallDisplayUnSuccessfulCheckout() {
        Library mockedLibrary = mock(Library.class);
        View mockedView = mock(View.class);

        CheckIn checkIn = new CheckIn(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn);

        when(mockedLibrary.checkInItem("Success")).thenReturn(false);
        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedView).show(Messages.unsuccessfulBookCheckIn);
    }
}