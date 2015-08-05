package com.twu.biblioteca.presentation;

import com.twu.biblioteca.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

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
        books.add(book1);
        books.add(book2);
        HashMap<Item, String> checkedBooks = new HashMap<>();
        Library bookLibrary = new Library(books, checkedBooks);

        view.displayListOfItems(bookLibrary.getItems(), Messages.listOfBooks, Messages.booksHeader);

        assertEquals("List of Books\n" +
                "Name            Author          Year \n" +
                "Red Jhon        Martin          2004 \n" +
                "Success         Ricky           1994 \n", outContent.toString());
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

        view.show(Messages.librarianMenu);

        assertEquals("\n~~~~~~~~~~~~Menu~~~~~~~~~~~~\n" +
                "==============================\n"+
                "[0] Quit\n" +
                "[1] List Of Available Books\n" +
                "[2] Checkout Book\n" +
                "[3] CheckIn Book\n" +
                "[4] List Of Available Movies\n" +
                "[5] CheckOut Movie\n" +
                "[6] CheckIn Movie\n" +
                "[7] My Profile\n" +
                "[8] List Of CheckedOut Books\n" +
                "[9] List Of CheckedOut Movies\n" +
                "[10] List Of Users\n" +
                "[11] LogOut\n" +
                "==============================\n"+
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
    public void shouldDisplayUserInformation() {
        View view = new View();
        User user = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam", true);

        view.showUserInformation(user);

        assertEquals("Ram        ramprasad@twu.com    619            \n", outContent.toString());
    }

    @Test
    public void shouldDisplayCheckedOutList() {
        View view = new View();
        HashMap<Item, String> checkedOutItems = new HashMap<>();
        Movie movie1 = new Movie("Harry Potter", "2010", "David Yates", "9");
        Movie movie2 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");

        checkedOutItems.put(movie1, "Ram");
        checkedOutItems.put(movie2, "Laxman");
        view.displayCheckedOutList(checkedOutItems, Messages.listOfCheckedOutMovies, Messages.checkedOutMoviesHeader);

        assertEquals("List of CheckedOutMovies\n" +
                "Name            Director             year  ratings    Borrower       \n" +
                "InterStellar    Christopher Nolan    2014  10         Laxman\n" +
                "Harry Potter    David Yates          2010  9          Ram\n", outContent.toString());
    }

    @Test
    public void shouldDisplayListOfUsers() {
        View view = new View();
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam", true);
        User user2 = new User("Laxman", "laxmanrasad@twu.com", "916", "765-4321", "laxMan", false);

        users.add(user1);
        users.add(user2);
        view.displayListOfUsers(users, Messages.listOfUsers, Messages.userHeader);

        assertEquals("List of Users\n" +
                "Name       Email Address        Phone No       \n" +
                "Ram        ramprasad@twu.com    619            \n" +
                "Laxman     laxmanrasad@twu.com  916            \n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }
}