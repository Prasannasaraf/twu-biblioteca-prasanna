package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void shouldGiveListOfBooks() {
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        Library library = new Library(book1,book2);
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Red Jhon", "Martin", "2004"));
        books.add(new Book("Success", "Ricky", "1994"));

        assertEquals(books,library.getBooks());
    }
}