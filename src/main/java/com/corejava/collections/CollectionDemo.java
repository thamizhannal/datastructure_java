package com.corejava.collections;

import java.util.*;
import java.util.stream.Stream;

import java.util.stream.Collectors;

public class CollectionDemo {

    Collection c;
    ArrayList a;

    public static void main(String[] args) {
        Collection<String> c = Arrays.asList("abc","efg","hij");
        List<String> list = new ArrayList<String>(c);
        System.out.println(list);

        // Check bulk collection operations
        Collection<String> c1 = new HashSet<>();
        c1.addAll(Arrays.asList("abc","efg","hij"));

        Collection<String> c2 = new HashSet<>();
        c2.addAll(Arrays.asList("abc","efg","hij"));

        Collection<String> c3 = new HashSet<>();
        c3.addAll(Arrays.asList("abc","efg","hij", "xyz","uvw"));

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);
        System.out.println("c1.containsAll(c2)="+c1.containsAll(c2));
        System.out.println("c3.retainAll(c1)="+c3.retainAll(c1));

        System.out.println("c1="+c1);
        System.out.println("c3="+c3);

        //remove all
        System.out.println("c2.removeAll(c3)="+c2.removeAll(c3));
        System.out.println("c2="+c2);

        Collection<String> c4 = new HashSet<>();
        c4.addAll(Arrays.asList("abc","efg","hij"));

        Collection<String> c5 = new HashSet<>();
        c5.addAll(Arrays.asList("abc","efg","hij", "xyz","uvw"));
        System.out.println("c5.removeAll(Collections.singleton( \"abc\")=>"+c5.removeAll(Collections.singleton( "abc")));
        System.out.println("c5="+c5);

        //collection interface Array ops
        Object[] a = c.toArray();
        System.out.println("a="+ a[0]);


    }

}
