package com.corejava.generics;

import com.corejava.generics.GenBox;
import com.corejava.generics.BoxObj;



public class GenericBoxDemo {

    public static void main(String[] args) {

        BoxObj b = new BoxObj();
        b.set(10);

        System.out.println("After set 10 to box, value of box is "+b.get());
        b.set("ABCD");
        System.out.println("After set ABCD to box, value of box is "+b.get());

        // Generic Box
        GenBox<Integer> gBox = new GenBox<Integer>(100);
        System.out.println("After set 100 to GenBox, value of box is "+gBox.get());


    }
}
