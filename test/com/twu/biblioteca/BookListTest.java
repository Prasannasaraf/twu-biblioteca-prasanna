package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    @Test
    public void shouldGiveListOfBooks() {
        BookList bookList = new BookList();
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Red Jhon"));
        books.add(new Book("Success"));

        assertEquals(books,bookList.getBooks());
    }
}