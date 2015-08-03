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
    menu("\n\t\tMenu\n" +
            "[0] Quit\n" +
            "[1] List Books\n" +
            "[2] Checkout Book\n" +
            "[3] CheckIn Book\n" +
            "[4] List Movies\n" +
            "[5] CheckOut Movie\n" +
            "[6] CheckIn Movie\n" +
            "Enter Your Option :");

    private  String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
