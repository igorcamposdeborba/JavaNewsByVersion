package org.igorborba.java25.stablepreviousfeatures;

public class ValueBasedClass {
    public static void main(String[] args){

        Integer i1 = 5; // todo: class based on value doesn't need instantiate
        Integer i2 = new Integer(5); // previously we need call the constructor Integer(5)
        
        System.out.println(i1);
    }
}
