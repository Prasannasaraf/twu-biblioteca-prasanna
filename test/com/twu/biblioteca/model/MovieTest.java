package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MovieTest {

    @Test
    public void moviesShouldGiveDetails() {
        Movie movie = new Movie("Harry Potter", "2010", "David Yates", "9");

        assertEquals("Harry Potter    David Yates          2010  9         ", movie.toString());
    }

    @Test
    public void moviesTitleShouldBeTrueForSameTitle() {
        Movie movie = new Movie("Harry Potter", "2010", "David Yates", "9");

        assertTrue(movie.hasTitle("Harry Potter"));
    }
}