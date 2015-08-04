package com.twu.biblioteca;

public enum Messages {
    welcome("Welcome to Biblioteca"),
    invalidOption("Select a valid option!"),
    enterBookName("Enter the Book Name:"),
    enterMovieName("Enter the Movie Name:"),
    successfulBookCheckout("Thank you! Enjoy the book"),
    successfulMovieCheckout("Thank you! Enjoy the Movie"),
    unsuccessfulBookCheckOut("That book is not available."),
    unsuccessfulMovieCheckOut("That Movie is not available."),
    successfulBookCheckIn("Thank you for returning the book."),
    successfulMovieCheckIn("Thank you for returning the Movie."),
    unsuccessfulBookCheckIn("That is not a valid book to return."),
    unsuccessfulMovieCheckIn("That is not a valid Movie to return."),
    booksHeader(String.format("%-15s %-15s %-5s\n", "Name", "Author", "Year")),
    moviesHeader(String.format("%-15s %-20s %-5s %-2s\n", "Name", "Director", "year", "ratings")),
    listOfBooks("List of Books"),
    listOfMovies("List of Movies"),
    listOfCheckedOutBooks("List of CheckedOutBooks"),
    listOfCheckedOutMovies("List of CheckedOutMovies"),
    menu("\n\t\tMenu\n" +
            "[0] Quit\n" +
            "[1] List Books\n" +
            "[2] List Books\n" +
            "[3] Checkout Book\n" +
            "[4] CheckIn Book\n" +
            "[5] List Movies\n" +
            "[6] List Movies\n" +
            "[7] CheckOut Movie\n" +
            "[8] CheckIn Movie\n" +
            "Enter Your Option :");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}