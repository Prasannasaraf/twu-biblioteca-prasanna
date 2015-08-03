package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessagesTest {

    @Test
    public void shouldGiveWelcomeMessage() {
        Messages messages =  Messages.welcome ;
        assertEquals("Welcome to Biblioteca",messages.getMessage());
    }
}