package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam", true);
    }

    @Test
    public void credentialsShouldMatch() {
        assertEquals(true, user.match("123-4567", "ramRam"));
    }

    @Test
    public void isLibrarianShouldGiveTrue() {
        assertEquals(true, user.isLibrarian());
    }
}