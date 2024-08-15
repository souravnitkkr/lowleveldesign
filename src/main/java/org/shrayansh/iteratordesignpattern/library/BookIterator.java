package org.shrayansh.iteratordesignpattern.library;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator {

    private List<Book> bookList;
    private int index=0;


    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return bookList.get(index++);
    }
}
