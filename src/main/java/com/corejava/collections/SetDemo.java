package com.corejava.collections;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {
        //Stream<String> stream = Arrays.asList("abc","efg","hij","xyz","abc").stream();
        Set<String> findDups = new HashSet<String>(Arrays.asList("abc","efg","hij","xyz","abc"));
        System.out.println("findDups (\"abc\",\"efg\",\"hij\",\"xyz\",\"abc\")="+findDups);

        // method2
        System.out.println("List=\"abc\",\"efg\",\"hij\",\"xyz\",\"abc\"");
        System.out.println("After findDups="+Arrays.asList("abc","efg","hij","xyz","abc").stream().collect(Collectors.toSet()));

        //method3

        Set<String> s = new HashSet<String>();
        for (String a : Arrays.asList("abc","efg","hij","xyz","abc"))
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);


        List<String> s1 =  Arrays.asList("abcd","efgh","ijkl","mnop","uvw");
        List<String> s2 =  Arrays.asList("abcd","efgh","ijkl","mnop","xyz");
        System.out.println("S1="+s1+"\ns2="+s2);
        System.out.println("S1="+s1+"\ns2="+s2);

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        System.out.println("union="+union);

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);
        System.out.println("intersection="+intersection);

        Set<String> difference = new HashSet<String>(s1);
        difference.removeAll(s2);
        System.out.println("difference="+difference);

        TreeSet<String> tSet;
    }
}
