package com.twu.biblioteca.model;


//Book has Author, Title, Year.
public class Book implements Item {
    private final String title;
    private final String author;
    private final String year;

    public Book(String name, String author, String year) {
        this.title = name;
        this.author = author;
        this.year = year;
    }

    public boolean hasTitle(String name) {
        return title.equals(name);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-5s", title, author, year);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}