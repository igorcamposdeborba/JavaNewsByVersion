package org.igorborba.java21;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {

        SequencedCollection<String> basket = new LinkedHashSet<>();

        basket.addAll(List.of("Banana", "Orange", "pineapple", "apple"));

        basket.addFirst("Watermelon"); // todo: new methods: addFirst, removeLast, getFirst, reversed...
        basket.stream().forEach(System.out::println);

        basket.reversed().stream().forEach(System.out::println);
    }
}
