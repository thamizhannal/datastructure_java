package com.corejava.generics;

import com.corejava.generics.Pair;
import com.corejava.generics.GenericsDemo;

public class OrderedPair<K, V> implements  Pair<K,V> {
    private K k;
    private V v;

    public OrderedPair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }
    public V getValue() {
        return v;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        System.out.println("Pair p1 added with k=Even v=8");
        System.out.println(p1);

        // OrderedPair<String, Integer>, instantiates K as a String and V as an Intege
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
        System.out.println("Pair p2 added with k=hello v=world");
        System.out.println(p2);

        GenBox<Integer> gBox = new GenBox<Integer>(100);
        OrderedPair<String, GenBox<Integer>> p3 = new OrderedPair<>("primes", gBox );
        System.out.println("Pair p3 added with k=primes  v=GenBox(100) ");
        System.out.println(p3);

    }

}

