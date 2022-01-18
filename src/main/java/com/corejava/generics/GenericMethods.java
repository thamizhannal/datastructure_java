package com.corejava.generics;

class Util {
    public static <K, V> boolean compare(GenPair<K, V> p1, GenPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

}
class GenPair<K, V> {

    private K key;
    private V value;

    public GenPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }

}

public class GenericMethods {
    public static void main(String[] args) {
        GenPair<Integer, String> p1 = new GenPair<>(1, "apple");
        GenPair<Integer, String> p2 = new GenPair<>(2, "pear");
        GenPair<Integer, String> p3 = new GenPair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);

        System.out.println("p1<1,apple> equals p2<2,pear> =" + same);

        System.out.println("p2<2,pear> equals p3<2,pear> =" + Util.<Integer, String>compare(p3, p2));
    }

}

