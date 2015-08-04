package com.twu.biblioteca.model;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Movie;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    ArrayList<Item> books;
    ArrayList<Item> books1;
    ArrayList<Item> checkedOutBooks;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library bookLibrary;

    ArrayList<Item> movies;
    ArrayList<Item> movies1;
    ArrayList<Item> checkedOutMovies;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Library movieLibrary;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("Red Jhon", "Martin", "2004");
        book2 = new Book("Success", "Ricky", "1994");
        book3 = new Book("Red Jhon", "Martin", "2004");
        book4 = new Book("Success", "Ricky", "1994");
        books = new ArrayList<>();
        books1 = new ArrayList<>();
        checkedOutBooks = new ArrayList<>();

        movie1 = new Movie("Harry Potter", "2010", "David Yates", "9");
        movie2 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");
        movie3 = new Movie("Harry Potter", "2010", "David Yates", "9");
        movie4 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");
        movies = new ArrayList<>();
        movies1 = new ArrayList<>();
        checkedOutMovies = new ArrayList<>();

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
    public void shouldCheckOutBookFromLibrary() {
        bookLibrary.checkOutItem("Success");
        books1.remove(book4);

        assertEquals(books1, bookLibrary.getItems());
    }

    @Test
    public void shouldGiveTrueOnSuccessfulCheckout() {
        assertEquals(true, bookLibrary.checkOutItem("Success"));
    }

    @Test
    public void shouldGiveFalseOnUnSuccessfulCheckout() {
        assertEquals(false, bookLibrary.checkOutItem("sjsjsj"));
    }

    @Test
    public void shouldCheckInBookToLibrary() {
        bookLibrary.checkOutItem("Success");

        assertEquals(true, bookLibrary.checkInItem("Success"));
    }

    @Test
    public void shouldNotCheckInBookToLibrary() {
        assertEquals(false, bookLibrary.checkInItem("Success"));
    }
}