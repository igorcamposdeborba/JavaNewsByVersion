package org.igorborba.java16;

public class ValueBasedClass {
    public static void main(String[] args){

        Integer i1 = 5; // todo: class based on value doesn't need instantiate
        Integer i2 = new Integer(5); // previously we need call the constructor Integer(5)

        System.out.println(i1);

        System.out.println(i1 == i2); // compare reference of memory (result in false)
        System.out.println(i1.equals(i2)); // compare the value (result in true)
    }
}
