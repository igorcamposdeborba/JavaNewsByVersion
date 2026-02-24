package org.igorborba.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class VarInLambda {
    public static void main(String[] args) {

        List values = new ArrayList(List.of(48.0, 12.0, 10.0, 5.0, 98.0));

        Function<Double, Double> multipliesBy2 = (var value) -> value * 2; // todo: var allowed in functional interface

        values.stream()
                .map(multipliesBy2)
                .forEach(System.out::println); // method reference ::

    }
}
