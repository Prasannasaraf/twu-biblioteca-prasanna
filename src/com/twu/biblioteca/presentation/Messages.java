package com.twu.biblioteca.presentation;

public enum Messages {
    welcome("Welcome to Biblioteca"),
    invalidOption("Select a valid option!"),
    enterBookName("Enter the Book Name:"),
    enterMovieName("Enter the Movie Name:"),
    enterUserName("Enter User Name"),
    enterPassword("Enter Password"),

    errLogin("Incorrect Username Or Password"),
    successfulBookCheckout("Thank you! Enjoy the book"),
    successfulMovieCheckout("Thank you! Enjoy the Movie"),
    successfulBookCheckIn("Thank you for returning the book."),
    successfulMovieCheckIn("Thank you for returning the Movie."),
    unsuccessfulBookCheckOut("That book is not available."),
    unsuccessfulMovieCheckOut("That Movie is not available."),
    unsuccessfulBookCheckIn("That is not a valid book to return."),
    unsuccessfulMovieCheckIn("That is not a valid Movie to return."),

    booksHeader(String.format("%-15s %-15s %-5s\n", "Name", "Author", "Year")),
    checkedOutBooksHeader(String.format("%-15s %-15s %-5s %-15s\n", "Name", "Author", "Year", "Borrower")),
    moviesHeader(String.format("%-15s %-20s %-5s %-2s\n", "Name", "Director", "year", "ratings")),
    checkedOutMoviesHeader(String.format("%-15s %-20s %-5s %-10s %-15s\n", "Name", "Director", "year", "ratings", "Borrower")),
    userHeader(String.format("%-10s %-20s %-15s\n----------------------------------------", "Name", "Email Address", "PhoneNo")),

    listOfBooks("List of Books"),
    listOfMovies("List of Movies"),
    listOfCheckedOutBooks("List of CheckedOutBooks"),
    listOfCheckedOutMovies("List of CheckedOutMovies"),
    listOfUsers("List of Users"),

    loginMenu("\n~~~~~~~~~~~~~Menu~~~~~~~~~~~~~\n" +
            "==============================\n" +
            "[0] Quit                    \n" +
            "[1] Login                   \n" +
            "==============================\n" +
            "Enter Your Option :"),

    librarianMenu("\n~~~~~~~~~~~~Menu~~~~~~~~~~~~\n" +
            "==============================\n" +
            "[0] Quit\n" +
            "[1] List Of Available Books\n" +
            "[2] Checkout Book\n" +
            "[3] CheckIn Book\n" +
            "[4] List Of Available Movies\n" +
            "[5] CheckOut Movie\n" +
            "[6] CheckIn Movie\n" +
            "[7] My Profile\n" +
            "[8] List Of CheckedOut Books\n" +
            "[9] List Of CheckedOut Movies\n" +
            "[10] List Of Users\n" +
            "[11] LogOut\n" +
            "==============================\n" +
            "Enter Your Option :"),

    userMenu("\n~~~~~~~~~~~~Menu~~~~~~~~~~~~\n" +
            "==============================\n" +
            "[0] Quit\n" +
            "[1] List Of Available Books\n" +
            "[2] Checkout Book\n" +
            "[3] CheckIn Book\n" +
            "[4] List Of Available Movies\n" +
            "[5] CheckOut Movie\n" +
            "[6] CheckIn Movie\n" +
            "[7] My Profile\n" +
            "[8] LogOut\n" +
            "==============================\n" +
            "Enter Your Option :");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}