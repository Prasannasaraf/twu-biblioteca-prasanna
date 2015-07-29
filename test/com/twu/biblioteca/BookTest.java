package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldGiveBookName() {
        Book book = new Book("Red Jhon","Martin ","1994");
        assertEquals("Red Jhon", book.getName());
    }
}