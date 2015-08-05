package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DisplayCheckedOutListTest {

    @Test
    public void shouldCallDisplayCheckedOutItems() {
        View view = mock(View.class);
        Library library = mock(Library.class);
        DisplayCheckedOutList displayCheckedOutList = new DisplayCheckedOutList(view, library.getCheckedOutItems(), Messages.listOfCheckedOutMovies, Messages.checkedOutMoviesHeader);

        displayCheckedOutList.execute();

        verify(view).displayCheckedOutList(library.getCheckedOutItems(), Messages.listOfCheckedOutMovies, Messages.checkedOutMoviesHeader);
    }
}