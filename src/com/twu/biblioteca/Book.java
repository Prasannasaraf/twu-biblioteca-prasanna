package com.twu.biblioteca;


//Book has Author, Title, Year.
public class Book {
    private final String title;
    private final String author;
    private final String year;

    public Book(String name, String author, String year) {
        this.title = name;
        this.author = author;
        this.year = year;
    }

    public Boolean hasTitle(String name) {
        if (title.equals(name))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-5s",title,author,year);
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