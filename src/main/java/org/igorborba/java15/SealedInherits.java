package org.igorborba.java15;

// todo: sealed class (permits) only these subclasses inherits, to security. Has as well non-sealed

sealed interface Shape permits Square,Circle {
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

non-sealed class Circle implements Shape { // todo: NON-SEALED class: permits inherits
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double radius(){
        return radius;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}

final class Ring extends Circle {
    private double height;

    public Ring(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume(){
        return area() * height;
    }
    @Override
    public double area(){
        return 2 * super.area() + 2 * Math.PI * super.radius() * height;
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

        Shape shape3 = new Ring(1, 2); // todo: ring inherits circle (it's non-sealed to permits inheritance)
        System.out.println(shape3);
    }
}
