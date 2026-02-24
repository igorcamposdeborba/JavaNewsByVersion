package org.igorborba.java14;

interface Animal {
    void makeSound();
}
class Dog implements  Animal {
    public Dog(){}

    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}
class Cat implements  Animal {
    public Cat(){}

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class InstanceofPatternMatching {
    public static void main(String[] args) {

        Animal animal1 = new Dog();

        if (animal1 instanceof Cat cat){ // todo: Pattern matching with instance of avoid downcasting
            cat.makeSound(); // todo: we don't need casting (Cat) cat.makeSound()  because instanceof in the scope identifies the context
                             // and declare a variable cat
        } else if (animal1 instanceof Dog dog){
            dog.makeSound();
        }

    }
}
