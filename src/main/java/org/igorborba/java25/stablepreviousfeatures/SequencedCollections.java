package org.igorborba.java25.stablepreviousfeatures;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedCollections {
    public static void main(String[] args) {
        // todo: SEQUENCEDmap (...List, Set) allows getFirst, getLast
        SequencedMap<Integer, String> customers = new LinkedHashMap<>();

        customers.put(1, "Igor Borba");
        customers.put(2, "Laura Borba");
        customers.put(3, "Roberto Borba");

        var first = customers.firstEntry();
        System.out.println("First Client - key and value: " + first.getKey() + " -> " + first.getValue());

        // 2. Usando getFirst() apenas nas Chaves
        Integer second = customers.sequencedKeySet().getFirst();
        System.out.println("First key: " + second);

        // 3. Usando getFirst() apenas nos Valores
        String third = customers.sequencedValues().getFirst();
        System.out.println("First value: " + third);

        System.out.println(customers.reversed());

    }
}

