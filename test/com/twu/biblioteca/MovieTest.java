package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void moviesShouldGiveDetails() {
        Movie movie = new Movie("Harry Potter", "2010", "David Yates", "9");

        assertEquals("Harry Potter    David Yates     2010  9    ", movie.toString());
    }
}