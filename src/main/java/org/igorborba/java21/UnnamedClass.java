package org.igorborba.java21;

public class UnnamedClass {
    public static void main(String[] args) {
        Animal dog = new Animal(){ // todo: anonymous class (declare and instantiate in the same time): extends an abstract class
            @Override
            void makeSound(){
                System.out.println("Woof");
            }
        };

        dog.makeSound();
    }
}


abstract class Animal {
    abstract void makeSound();
}

