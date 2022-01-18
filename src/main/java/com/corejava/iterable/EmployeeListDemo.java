package com.corejava.iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeListDemo {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Arun", "Vimal", "Edward", "Neil");
        // parsing list of Employee names to EmployeeList iterator.
        EmployeeList<String> myList = new EmployeeList<>(names);

        Iterator<String> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}