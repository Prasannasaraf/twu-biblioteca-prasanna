package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    private ArrayList<Item> books;
    private ArrayList<Item> books1;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Library bookLibrary;

    private ArrayList<Item> movies;
    private ArrayList<Item> movies1;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private Movie movie4;
    private Library movieLibrary;
    private HashMap<Item, String> checkedOutBooks;
    private HashMap<Item, String> checkedOutMovies;
    private String user;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("Red Jhon", "Martin", "2004");
        book2 = new Book("Success", "Ricky", "1994");
        book3 = new Book("Red Jhon", "Martin", "2004");
        book4 = new Book("Success", "Ricky", "1994");

        books = new ArrayList<>();
        books1 = new ArrayList<>();

        movie1 = new Movie("Harry Potter", "2010", "David Yates", "9");
        movie2 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");
        movie3 = new Movie("Harry Potter", "2010", "David Yates", "9");
        movie4 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");

        checkedOutBooks = new HashMap<>();
        checkedOutMovies = new HashMap<>();

        user = "Ram";
        movies = new ArrayList<>();
        movies1 = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books1.add(book3);
        books1.add(book4);

        movies.add(movie1);
        movies.add(movie2);
        movies1.add(movie3);
        movies1.add(movie4);

        bookLibrary = new Library(books, checkedOutBooks);
        movieLibrary = new Library(movies, checkedOutMovies);
    }

    @Test
    public void shouldGiveListOfBooks() {
        assertEquals(books1, bookLibrary.getItems());
    }

    @Test
    public void shouldGiveListOfMovies() {
        assertEquals(movies, movieLibrary.getItems());
    }

    @Test
    public void shouldCheckOutBookFromLibrary() {
        bookLibrary.checkOutItem(user, "Success");
        books1.remove(book4);

        assertEquals(books1, bookLibrary.getItems());
    }

    @Test
    public void shouldGiveTrueOnSuccessfulCheckout() {
        assertEquals(true, bookLibrary.checkOutItem(user, "Success"));
    }

    @Test
    public void shouldGiveFalseOnUnSuccessfulCheckout() {
        assertEquals(false, bookLibrary.checkOutItem(user, "Successff"));
    }

    @Test
    public void shouldCheckInBookToLibrary() {
        bookLibrary.checkOutItem(user, "Success");

        assertEquals(true, bookLibrary.checkInItem(user, "Success"));
    }

    @Test
    public void shouldNotCheckInBookToLibrary() {
        assertEquals(false, bookLibrary.checkInItem(user, "Success"));
    }
}