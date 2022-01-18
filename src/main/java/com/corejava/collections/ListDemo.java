package com.corejava.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class ListDemo {

    private static class Person{
        String name;
        int salary;
        String company;

        public Person(String name, int salary, String company) {
            this.name = name;
            this.salary = salary;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }
    }

    public <E> void swap(List<E> l, int i, int j) {
        E tmp = l.get(i);
        l.set(i,l.get(j));
        l.set(j,tmp);
    }

    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        List<String> l1 = new ArrayList<String>(Arrays.asList( "abc","efg","hij","xyz"));
        System.out.println(l1);

        // add always end of the list.
        System.out.println("Add->ABC="+l1.add("ABC")+"\t"+l1);

        // remove always begin of the list.
        System.out.println("remove->abc="+l1.remove("abc")+"\t"+l1);

        //
        Person p1 = new Person("Vimal", 1000, "HTS");
        Person p2 = new Person("Rajiv", 2000, "HTS2");
        Person p3 = new Person("Rajan", 3000, "MIC");


        List<Person> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);

        List<Integer> list = person.stream().map(Person::getSalary).collect(Collectors.toList());
        System.out.println(person);
        System.out.println("Salary from person:"+list);

        System.out.println(l1);
        listDemo.swap(l1, 1 ,2 );
        System.out.println("Swap: idx 1 with idx 2:");
        System.out.println(l1);
    }
}
