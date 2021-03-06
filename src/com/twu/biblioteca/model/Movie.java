package com.twu.biblioteca.model;


//Movie has name, year, director and ratings
public class Movie implements Item{

    private final String name;
    private final String ratings;
    private final String director;
    private final String year;

    public Movie(String name, String year, String director, String ratings) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-5s %-10s", name, director, year, ratings);
    }

    public boolean hasTitle(String movieName) {
        if (name.equals(movieName))
            return true;
        return false;
    }
}