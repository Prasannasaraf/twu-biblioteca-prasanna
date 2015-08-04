package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldGiveBookDetails() {
        Book book = new Book("Red Jhon", "Martin ", "1994");
        assertEquals("Red Jhon        Martin          1994 ", book.toString());
    }

    @Test
    public void shouldGiveTrueWhenTitleIsSame() {
        Book book = new Book("Red Jhon", "Martin ", "1994");

        assertEquals(true, book.hasTitle("Red Jhon"));
    }
}