package org.igorborba.java22;

public class DeclarationBeforeSuper {
    public static void main(String[] args) {
        try {
            Square square0 = new Square(4, 10);
            Square square1 = new Square(5, 10);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
abstract class Figure2D{
    private int sides;
    private int height;

    public Figure2D(int sides, int height){
        this.sides = sides;
        this.height = height;
    }
}

class Square extends Figure2D {
    public Square(int sides, int height){
        if (sides != 4 || sides <= 0){ // todo: validation before the super()
            throw new IllegalArgumentException("The 2D square must to have 2 sides");
        }
        super(sides, height);
    }
}
