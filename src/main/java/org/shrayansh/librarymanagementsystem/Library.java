package org.shrayansh.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        bookList=new ArrayList<>();
    }

    // function to add a book to the library
    public void addBook(Book book){
        bookList.add(book);
        System.out.println("Book has been added to the library");
    }

    // function to remove a book from the library
    public boolean removeBook(String ISBN){
        for(Book book:bookList){
            if(book.getISBN().equals(ISBN)){
                bookList.remove(book);
                System.out.println("Book with ISBN : "+ISBN +" has been removed");
                return true;
            }
        }
        System.out.println("Book with ISBN : " +ISBN +" is not found in the library");
        return false;
    }

    // function to search for a book in the library
    public Book searchBook(String ISBN){
        for(Book book:bookList){
            if(book.getISBN().equals(ISBN)){
                System.out.println("Book with ISBN : "+ISBN+" has been found");
                return book;
            }
        }
        System.out.println("Book with ISBN : "+ISBN+" has not been found");
        return null;
    }

    // function to display all books in the library
    public void displayAllBooks(){
        System.out.println("Displaying all the books present in the library");
        for(Book book:bookList){
            System.out.println(book);
        }
    }

}
