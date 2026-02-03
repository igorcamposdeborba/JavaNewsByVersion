package org.igorborba.java20;

public class ScopedValueExample {

    static final ScopedValue<String> NAME = ScopedValue.newInstance(); // todo: SCOPPED VALUE: avoid re declaring the parameter in Thread

    public static void main(String[] args) {

        ScopedValue.where(NAME, "Igor")
                .run(() -> printGreetings()); // todo: avoid re declaring the parameter in Thread

        ScopedValue.where(NAME, "Borba")
                .call(() -> {
                    printGreetings();
                return null;
                });
    }


    private static void printName(String name){
        System.out.println(name);
    }
    private static void printHello(){
        System.out.print("Hello ");
        printName(NAME.get());
    }
    private static void printGreetings(){
        printHello();
    }
}
