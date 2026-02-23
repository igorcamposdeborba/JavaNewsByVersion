package org.igorborba.java17;

public class SwitchExpression {
    public static void main(String[] args) {
        Object obj1 = 1.0;

        // todo: switch STATEMENT: when hasn't a return (it's a STATEMENT, because return void)
        switch (obj1){
            case Integer value -> {  // todo: doesn't needs instanceof
                int i1 = value + 1;
                System.out.println("Integer (sum +1): " + i1);

            }
             // break  is no longer necessary
            case Double value when value > 0 -> { // todo: when (this notation is an &&)
                double d1 = value + 2;
                System.out.println("Double (sum +2): " + d1);
            }
            default -> System.out.printf("Data type is not registered: %s%n", obj1);
        }

        // todo: switch EXPRESSION: has a return (it's a SWITCH EXPRESSION to keep it in a variabel, because return a value)
        var result = switch (obj1){ // var: infers the datatype in compilation time, final datatype AND hasn't for instance .length for String. We use the var in loop (for each), example:  for (var item : list)
            case Integer value -> {  // todo: doesn't needs instanceof
                int i1 = value + 10;
                System.out.println("Integer (sum +10): " + i1);
                yield i1; // todo: must to have YIELD, not return
            }
            // break  is no longer necessary
            case Double value -> {
                double d1 = value + 20;
                System.out.println("Double (sum +20): " + d1);
                yield d1;
            }
            default -> {
                System.out.printf("Data type is not registered: %s%n", obj1);
                yield obj1;
            }
        };

        System.out.println("Returned: " + result);
    }
}
