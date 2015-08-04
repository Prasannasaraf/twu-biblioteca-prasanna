package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


//Used for Input Output
public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowWelcomeMessage() {
        View view = new View();

        view.show(Messages.welcome);

        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @Test
    public void shouldDisplayListOfBooks() {
        View view = new View();
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        ArrayList<Item> books = new ArrayList<>();
        ArrayList<Item> checkOutBooks = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Library bookLibrary = new Library(books, checkOutBooks);

        view.displayListOfItems(bookLibrary.getItems(), Messages.listOfBooks, Messages.booksHeader);
        assertEquals("List of Books\nName            Author          Year \nRed Jhon        Martin          2004 \nSuccess         Ricky           1994 \n", outContent.toString());
    }

    @Test
    public void shouldDisplayInvalidOption() {
        View view = new View();

        view.show(Messages.invalidOption);

        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldDisplayMenuOptions() {
        View view = new View();

        view.show(Messages.menu);

        assertEquals("\n\t\tMenu\n" +
                "[0] Quit\n" +
                "[1] List Books\n" +
                "[2] List Books\n" +
                "[3] Checkout Book\n" +
                "[4] CheckIn Book\n" +
                "[5] List Movies\n" +
                "[6] List Movies\n" +
                "[7] CheckOut Movie\n" +
                "[8] CheckIn Movie\n" +
                "Enter Your Option :\n", outContent.toString());
    }

    @Test
    public void shouldDisplaySuccessfulCheckout() {
        View view = new View();

        view.show(Messages.successfulBookCheckout);

        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }

    @Test
    public void shouldDisplayUnSuccessfulCheckout() {
        View view = new View();

        view.show(Messages.unsuccessfulBookCheckOut);

        assertEquals("That book is not available.\n", outContent.toString());
    }

    @Test
    public void shouldDisplaySuccessfulCheckIn() {
        View view = new View();

        view.show(Messages.successfulBookCheckIn);

        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }

    @Test
    public void shouldDisplayUnSuccessfulCheckIn() {
        View view = new View();

        view.show(Messages.unsuccessfulBookCheckIn);

        assertEquals("That is not a valid book to return.\n", outContent.toString());
    }

    @Test

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }
}