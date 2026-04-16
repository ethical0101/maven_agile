package com.example.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryManagementSystemTest {

    @Test
    public void testCalculateFine() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 16));
        books.add(new Book("Data Structures", 10));

        double fine = LibraryManagementSystem.calculateFine(books);
        assertEquals(4.0, fine, 0.01);
    }
}