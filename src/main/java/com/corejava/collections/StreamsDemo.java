package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsDemo {

    Collection c;
    ArrayList a;

    public static void main(String[] args) {
        List<String> names = Arrays.asList("https://abc.com", "http://xyz.edu", "https://efg.org", "http://hik.org");

        Collection<String> urls = new ArrayList<String>();
        urls.addAll(names);
        System.out.println("Streams");
        urls.stream().
                filter(e->e.startsWith("https://")).
                forEach(e -> System.out.println(e));

        Collection<String> purls = new ArrayList<String>();
        purls.addAll(names);

        System.out.println("Parallel Streams");
        purls.parallelStream().
                filter(e->e.startsWith("http://")).
                forEach(e -> System.out.println(e));

        String joined = urls.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println("String Join:"+joined);

        List<String> urlsList = Arrays.asList("https://abc.com", "http://xyz.edu", "https://efg.org", "http://hik.org",
                "https://abc.com", "http://xyz.edu", "https://efg.org", "http://hik.org",
                "https://abc.com", "http://xyz.edu", "https://efg.org", "http://hik.org"
        );





    }

}
