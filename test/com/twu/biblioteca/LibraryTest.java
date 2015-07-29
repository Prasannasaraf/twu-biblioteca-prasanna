package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void shouldGiveListOfBooks() {
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        assertEquals(2, library.getBooks().size());
        assertEquals(books,library.getBooks());
    }
}