package org.shrayansh.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String ID;
    private List<Book> checkedOutBooks;

    public Patron(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.checkedOutBooks=new ArrayList<>();
    }

    // function to return a book
    public boolean returnBook(Book book){
        for(int i=0;i< checkedOutBooks.size();i++){
            if(checkedOutBooks.get(i).getISBN() == book.getISBN()){
                book.returnBook();
                checkedOutBooks.remove(book);
                System.out.println(name + " has returned this book "+book);
                return true;
            }
        }
        System.out.println(name + " did not checkout this book "+book);
        return false;
    }

    // function to check out a book
    public boolean checkOutBook(Book book){
        if(book.isAvailable()) {
            book.checkOut();
            checkedOutBooks.add(book);
            System.out.println(book + " is checked out by "+name);
            return true;
        }else{
            System.out.println(book + " is not available");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }
}
