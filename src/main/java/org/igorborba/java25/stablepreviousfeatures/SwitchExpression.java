package org.igorborba.java25.stablepreviousfeatures;

import java.util.List;

public class SwitchExpression {
    public static void main(String[] args) {
        Object object = 1;

        var output = switch (object) { // var: infers the datatype in compilation time, final datatype AND hasn't for instance .length for String.
            case Integer i -> "int: " + i; // lambda return automatically, no longer necessary return
            case String s when s.length() > 5 -> "long string"; // WHEN is &&
            case String s -> {
                yield "string: " + s; // YIELD switch return. return isn't allowed here.
            }
            default -> "unknown";
        };
        System.out.println(output);


        List list = List.of(object);
        for (var item : list){  // We use the VAR in loop (for each), example:  for (var item : list)
            System.out.println(item);
        }
    }
}
