package com.corejava.iterable;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Objective is to create a list Iterator and manipulate elements
 */
public class EmployeeList<T> implements Iterable<T> {

    private List<T> empList;

    public EmployeeList(List<T> empList) {
        this.empList = empList;
    }

    public Iterator<T> iterator() {
        return new EmployeeIterator<T>();
    }


    private class EmployeeIterator<T> implements Iterator<T> {

        private int size = empList.size();
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T val = (T) empList.get(index);
            index += 1;
            return val;

        }
    }
}
