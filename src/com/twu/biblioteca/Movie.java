package com.twu.biblioteca;


//Movie has name, year, director and ratings
public class Movie implements Item{
    private String name;
    private String year;
    private String director;
    private String ratings;

    public Movie(String name, String year, String director, String ratings) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-5s %-2s", name, director, year, ratings);
    }

    public boolean hasTitle(String movieName) {
        if (name.equals(movieName))
            return true;
        return false;
    }
}