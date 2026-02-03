package org.igorborba.java19;

// todo: RECORD: create automatically get, set, constructor, equals, hashcode, toString
record Square(double width, double height) {
}

public class RecordPatternExample {
    public static void main(String[] args){
        Square square1 = new Square(2, 3);

        System.out.println(square1.width());
        System.out.println(square1);
    }
}
