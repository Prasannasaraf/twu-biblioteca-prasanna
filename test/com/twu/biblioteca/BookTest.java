package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldGiveBookName() {
        Book book = new Book("Red Jhon");
        assertEquals("Red Jhon", book.getName());
    }
}