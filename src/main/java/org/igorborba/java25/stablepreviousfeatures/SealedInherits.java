package org.igorborba.java25.stablepreviousfeatures;

// todo: sealed class (permits) only these subclasses inherits, to security
sealed interface Shape permits Square, Circle {
    public abstract double area();
}

final class Square implements Shape { // todo: subclasses must be 'final'
    private final double width,
                         height;
    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;
    }
}

final class Circle implements Shape {
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}
//class Triangle implements Shape { // It is not allowed, because is not defined in super class in 'permits'
//    private double base;
//    private double height;
//
//    public Triangle(double base, double height){
//        this.base = base;
//        this.height = height;
//    }
//    @Override
//    public double area(){
//        return (base * height) / 2;
//    }
//}

public class SealedInherits {
    public static void main(String[] args) {
        Shape shape1 = new Square(1, 2);
//        Shape shape2 = new Triangle(1, 2); // It is not allowed, because is not defined in super class in 'permits'
    }
}
