package com.twu.biblioteca;

import com.twu.biblioteca.controller.BibliotecaController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Item;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;


public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        Movie movie1 = new Movie("Harry Potter", "2010", "David Yates", "9");
        Movie movie2 = new Movie("InterStellar", "2014", "Christopher Nolan", "10");
        ArrayList<Item> books = new ArrayList<>();
        ArrayList<Item> checkOutBooks = new ArrayList<>();
        ArrayList<Item> movies = new ArrayList<>();
        ArrayList<Item> checkedOutMovies = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        movies.add(movie1);
        movies.add(movie2);
        Library booksLibrary = new Library(books, checkOutBooks);
        Library moviesLibrary = new Library(movies, checkedOutMovies);
        BibliotecaController bibliotecaController = new BibliotecaController(view, booksLibrary, moviesLibrary);
        bibliotecaController.start();
    }
}
