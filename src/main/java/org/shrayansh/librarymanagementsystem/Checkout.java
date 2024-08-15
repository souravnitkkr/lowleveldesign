package org.shrayansh.librarymanagementsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Checkout {
    private Map<Book, CheckoutDetails> checkouts = new HashMap<>();
    private static final int DAY_SECONDS = 60 * 60 * 24;
    private static final int MAX_FINE = 10;

    // Inner class to store checkout details
    private class CheckoutDetails {
        private Patron patron;
        private Date dueDate;

        public CheckoutDetails(Patron patron, Date dueDate) {
            this.patron = patron;
            this.dueDate = dueDate;
        }

        public Patron getPatron() {
            return patron;
        }

        public Date getDueDate() {
            return dueDate;
        }
    }

    // Function to check out a book
    public void checkOut(Book book, Patron patron) {
        if (book.isAvailable()) {
            patron.checkOutBook(book);
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 7); // 7 days from current time
            Date dueDate = calendar.getTime();
            checkouts.put(book, new CheckoutDetails(patron, dueDate));
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Function to return a book
    public void returnBook(Book book) {
        if (checkouts.containsKey(book)) {
            Patron patron = checkouts.get(book).getPatron();
            patron.returnBook(book);
            checkouts.remove(book);
        } else {
            System.out.println("Book has not been checked out.");
        }
    }

    // Function to display all current checkouts
    public void displayCheckouts() {
        System.out.println("Current checkouts:");
        for (Map.Entry<Book, CheckoutDetails> entry : checkouts.entrySet()) {
            Book book = entry.getKey();
            CheckoutDetails details = entry.getValue();
            System.out.println("Book: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Patron: " + details.getPatron().getName());
            System.out.println("Due Date: " + details.getDueDate());
            System.out.println();
        }
    }

    public Date getDueDate(Book book) {
        if (checkouts.containsKey(book)) {
            return checkouts.get(book).getDueDate();
        } else {
            System.out.println("Book has not been checked out.");
            return null;
        }
    }

    // Function to calculate the fine for a book that is overdue
    public double calculateFine(Book book) {
        Date dueDate = this.getDueDate(book);
        if (dueDate == null) {
            return 0.0;
        }
        Date currentDate = new Date();
        long secondsLate = TimeUnit.MILLISECONDS.toSeconds(currentDate.getTime() - dueDate.getTime());
        if (secondsLate < 0) {
            // Book was returned early, no fine
            return 0.0;
        } else {
            // Calculate fine based on how many days late the book is
            int daysLate = (int) (secondsLate / DAY_SECONDS);
            double fine = daysLate * 0.50;
            // Cap the fine at MAX_FINE
            return Math.min(fine, MAX_FINE);
        }
    }
}
