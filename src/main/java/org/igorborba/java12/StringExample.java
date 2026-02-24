package org.igorborba.java12;

public class StringExample {
    public static void main(String[] args) {

        String text = "Hi world\nIts an example text";

        // .transform allows stream
        String inverseText = text.transform(character -> new StringBuilder(character).reverse().toString());
        System.out.println(inverseText);

    }
}
