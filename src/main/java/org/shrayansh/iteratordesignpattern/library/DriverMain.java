package org.shrayansh.iteratordesignpattern.library;

import java.util.ArrayList;
import java.util.List;

public class DriverMain {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("Maths",500));
        bookList.add(new Book("Physics",600));
        bookList.add(new Book("Chemistry",700));
        Library library=new Library(bookList);
        Iterator iterator= library.createIterator();
        while (iterator.hasNext()){
            Book book= (Book) iterator.next();
            System.out.println(book);
        }
    }
}
