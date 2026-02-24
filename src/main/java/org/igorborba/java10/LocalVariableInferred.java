package org.igorborba.java10;

import java.util.List;

public class LocalVariableInferred {
    public static void main(String[] args) {

        /* Requirements
           - var must be local and initialized with value
           - can be used in ForEach and For
        */

        var value = "Igor Borba"; // todo: var infers the more large datatype (double > long. String > shor > byte)
        System.out.println(value instanceof String);

        var value2 = 10.0;
        System.out.println(value2 instanceof Double);

        var value3 = Double.valueOf(20);
        System.out.println(value3 instanceof Double);

        var listValues = List.of(value2, value3);
        for (var item : listValues){ // var used in forEach
            System.out.println(item);
        }
        for (var i=0; i<listValues.size(); i++){ // var used in For loop
            System.out.println(listValues.get(i));
        }

    }
}
