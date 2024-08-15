package org.shrayansh.iteratordesignpattern.company;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
