package org.igorborba.java22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;

public class GathersStream {
    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.addAll(List.of("Refrigerator", "TV 50'", "Microwave", "TV 65'", "Lamp"));

        products.stream().gather(Gatherers.windowFixed(2))  // todo: Gather default: windowFixed process 2 in 2 elements
                .forEach(System.out::println);

        CompareProducts compareProducts = new CompareProducts("TV");
        products.stream()
                .gather(compareProducts) // todo: customized gather: my class filter based on the parameter of constructor belows
                .forEach(System.out::println);

    }
}
// Gatherer interface: https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Gatherer.html
class CompareProducts implements Gatherer<String, String, String> {
    private final String product;

    public CompareProducts(String product){ // parameterized the product to process
        this.product = product;
    }

    // method to create the initial state
    @Override
    public Supplier<String> initializer() {
        return () -> "";
    }

    // process the logic (between initial state and downstream state)
    @Override
    public Integrator<String, String, String> integrator() {
        return (state, element, downstream) -> {
            if (state.isEmpty()){ // initial state
                state = element;
            }
            if (element.contains(product)){ // todo: process: element contains the product
                downstream.push(element);
            }
            return true;
        };
    }

    @Override
    public BinaryOperator<String> combiner() {
        return Gatherer.super.combiner();
    }

    @Override
    public BiConsumer<String, Downstream<? super String>> finisher() {
        return Gatherer.super.finisher();
    }

    @Override
    public <RR> Gatherer<String, ?, RR> andThen(Gatherer<? super String, ?, ? extends RR> that) {
        return Gatherer.super.andThen(that);
    }
}
