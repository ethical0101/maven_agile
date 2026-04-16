package com.example.library;

public class Book {
    private String title;
    private int daysBorrowed;

    public Book(String title, int daysBorrowed) {
        this.title = title;
        this.daysBorrowed = daysBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public int getDaysBorrowed() {
        return daysBorrowed;
    }
}