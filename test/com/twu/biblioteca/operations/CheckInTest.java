package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class CheckInTest {
    private User user;
    Library mockedLibrary;
    View mockedView;
    CheckIn checkIn;

    @Before
    public void setUp() throws Exception {
        mockedLibrary = mock(Library.class);
        mockedView = mock(View.class);
        user = mock(User.class);
        checkIn = new CheckIn(mockedView, mockedLibrary, Messages.enterBookName, Messages.successfulBookCheckIn, Messages.unsuccessfulBookCheckIn, user);
        when(user.getName()).thenReturn("Ram");
    }

    @Test
    public void checkInShouldCallCheckInBook() {
        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedLibrary).checkInItem(user.getName(), "Success");
    }

    @Test
    public void checkInShouldCallDisplaySuccessfulCheckout() {
        when(mockedLibrary.checkInItem(user.getName(), "Success")).thenReturn(true);
        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedView).show(Messages.successfulBookCheckIn);
    }

    @Test
    public void checkInShouldCallDisplayUnSuccessfulCheckout() {
        when(mockedLibrary.checkInItem(user.getName(), "Success")).thenReturn(false);
        when(mockedView.getInput()).thenReturn("Success");
        checkIn.execute();

        verify(mockedView).show(Messages.unsuccessfulBookCheckIn);
    }
}