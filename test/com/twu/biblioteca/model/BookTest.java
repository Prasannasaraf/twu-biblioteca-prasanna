package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Red Jhon", "Martin ", "1994");
    }

    @Test
    public void shouldGiveBookDetails() {
        assertEquals("Red Jhon        Martin          1994 ", book.toString());
    }

    @Test
    public void shouldGiveTrueWhenTitleIsSame() {
        assertEquals(true, book.hasTitle("Red Jhon"));
    }
}