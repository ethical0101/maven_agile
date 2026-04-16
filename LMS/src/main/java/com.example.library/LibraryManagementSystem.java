package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static final int ALLOWED_DAYS = 14;
    private static final double FINE_PER_DAY = 2.0;

    public static void main(String[] args) {
        User user = new User("John Doe", "U123");
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 16));
        books.add(new Book("Data Structures", 10));

        double totalFine = calculateFine(books);
        displayUserDetails(user, books, totalFine);
    }

    public static double calculateFine(List<Book> books) {
        double fine = 0.0;
        for (Book book : books) {
            int extraDays = book.getDaysBorrowed() - ALLOWED_DAYS;
            if (extraDays > 0) {
                fine += extraDays * FINE_PER_DAY;
            }
        }
        return fine;
    }

    public static void displayUserDetails(User user, List<Book> books, double fine) {
        System.out.println("User Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("ID: " + user.getId());
        System.out.println("\nBooks Issued:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (Days Borrowed: " + book.getDaysBorrowed() + ")");
        }
        System.out.println("\nTotal Fine: $" + fine);
    }
}