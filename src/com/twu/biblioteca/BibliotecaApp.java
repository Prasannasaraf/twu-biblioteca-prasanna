package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.controller.BibliotecaParser;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;
import java.util.HashMap;


public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();

        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        Movie movie1 = new Movie("Harry Potter", "2010", "David Yates", "9");
        Movie movie2 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");
        User user1 = new User("Ram", "ramprasad@twu.com", "619", "123-4567", "ramRam", true);
        User user2 = new User("Laxman", "laxmanrasad@twu.com", "916", "765-4321", "laxMan", false);

        ArrayList<Item> books = new ArrayList<>();
        ArrayList<Item> checkOutBooks = new ArrayList<>();
        ArrayList<Item> movies = new ArrayList<>();
        ArrayList<Item> checkedOutMovies = new ArrayList<>();
        HashMap<Item, String> checkedMovies = new HashMap<>();
        HashMap<Item, String> checkedBooks = new HashMap<>();
        ArrayList<User> users = new ArrayList<>();
        BibliotecaParser parser = new BibliotecaParser();

        books.add(book1);
        books.add(book2);
        movies.add(movie1);
        movies.add(movie2);
        users.add(user1);
        users.add(user2);

        Login login = new Login(users, view);
        Library booksLibrary = new Library(books, checkedBooks);
        Library moviesLibrary = new Library(movies, checkedMovies);

        BibliotecaController bibliotecaController = new BibliotecaController(view, booksLibrary, moviesLibrary, login, parser);
        bibliotecaController.start();
    }
}
