package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {
    ArrayList<Book> books;
    ArrayList<Book> books1;
    ArrayList<Book> checkedOutBooks;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("Red Jhon", "Martin", "2004");
        book2 = new Book("Success", "Ricky", "1994");
        book3 = new Book("Red Jhon", "Martin", "2004");
        book4 = new Book("Success", "Ricky", "1994");
        books = new ArrayList<Book>();
        books1 = new ArrayList<Book>();
        checkedOutBooks = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books1.add(book3);
        books1.add(book4);
        library = new Library(books, checkedOutBooks);
    }

    @Test
    public void shouldGiveListOfBooks() {
        assertEquals(books1, library.getBooks());
    }

    @Test
    public void shouldCheckOutBookFromLibrary() {
        library.checkOutBook("Success");
        books1.remove(book4);

        assertEquals(books1, library.getBooks());
    }

    @Test
    public void shouldGiveTrueOnSuccessfulCheckout() {
        assertEquals(true, library.checkOutBook("Success"));
    }

    @Test
    public void shouldGiveFalseOnUnSuccessfulCheckout() {
        assertEquals(false, library.checkOutBook("sjsjsj"));
    }

    @Test
    public void shouldCheckInBookToLibrary() {
        library.checkOutBook("Success");

        assertEquals(true, library.checkInBook("Success"));
    }

    @Test
    public void shouldNotCheckInBookToLibrary() {
        assertEquals(false, library.checkInBook("Success"));
    }
}