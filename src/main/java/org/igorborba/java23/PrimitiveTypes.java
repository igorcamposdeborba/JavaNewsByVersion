
package org.igorborba.java23;

public class PrimitiveTypes {
    public static void main(String[] args){

        Object obj1 = 200; // integer

        if (obj1 instanceof int i && i > 100){
            System.out.println("The integer number greater than 100");
        } else if (obj1 instanceof int i && i <= 100) {
            System.out.println("The integer number less or equals to 100");
        }

        switch (obj1) {
            case int i -> System.out.println("The value is an integer number");
            case double d -> System.out.println("The value is an double number");
            default -> System.out.println("Other type");
        }
    }
}
