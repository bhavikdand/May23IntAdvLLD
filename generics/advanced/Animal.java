package generics.advanced;

import java.io.Serializable;

public class Animal {

    public String name;
    private int age;

    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal implements Serializable {

    String breed;

    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal{

    public void meow(){
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
