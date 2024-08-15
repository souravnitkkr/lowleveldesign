package org.shrayansh.librarymanagementsystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create objects of Library, Book, Patron, and Checkout classes
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        Patron patron1 = new Patron("John Smith", "123");
        Patron patron2 = new Patron("Jane Doe", "456");
        Checkout checkout = new Checkout();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display all books in the library
        library.displayAllBooks();

        // Check out a book
        checkout.checkOut(book1, patron1);

        // Get the due date of the checked out book
        Date dueDate = checkout.getDueDate(book1);
        if (dueDate != null) {
            System.out.println("Due Date: " + dueDate);
        }

        // Calculate and display the fine for the overdue book
        double fine = checkout.calculateFine(book1);
        if (fine > 0) {
            System.out.println("Fine for overdue book: Rs" + fine);
        }

        // Display all current checkouts
        checkout.displayCheckouts();

        // Return a book
        checkout.returnBook(book1);

        // Display all current checkouts
        checkout.displayCheckouts();
    }
}

