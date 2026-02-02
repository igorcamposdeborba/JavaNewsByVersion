package org.igorborba.java21;

import java.util.stream.Stream;

public class UnnamedVariable {
    public static void main(String[] args) {
        int arrayInteger[] = {5, 4, 8, 11};

        int quantity = 0;

        for(int _ : arrayInteger){ // todo: UNNAMED VARIABLE _ (isn't used) - avoid @SuppressWarnings
            quantity++;
        }
        System.out.println(quantity);

    }
}
