package com.twu.biblioteca.model;

public class User {
    String name;
    String emailAddress;
    String phoneNumber;
    String libraryNo;
    String password;

    public User(String name, String emailAddress, String phoneNumber,String libraryNo, String password) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.libraryNo = libraryNo;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " "  + emailAddress + " " + phoneNumber;
    }

    public boolean match(String s, String ramRam) {
        if (libraryNo.equals(s))
            if (password.equals(ramRam))
                return true;
        return false;
    }
}