package com.twu.biblioteca.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest {

    @Test
    public void credentialsShouldMatch() {
        User user = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam");

        assertEquals(true, user.match("123-4567", "ramRam"));
    }
}