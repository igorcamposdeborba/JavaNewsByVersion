package org.igorborba.java19;

// todo: RECORD: create automatically get, set, constructor, equals, hashcode, toString. It's an immutable class
record Square(double width, double height) {
}

public class RecordPatternExample {
    public static void main(String[] args){
        Square square1 = new Square(2, 3);
        Object square2 = new Square(2, 3);

        System.out.println(square1.width());
        System.out.println(square1);

        if (square2 instanceof Square(double w, double h)){
            System.out.println("Rectangle with Width= " + w + " Height= " + h);  // todo: DESTRUCTURING in Record: appoint to variable and not square.getWith()
        }
    }
}
