package generics.advanced;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable>{
    T animal;

    public Printer(T animal) {
        this.animal = animal;
    }

    public void print(){
        System.out.println(animal.name);
        animal.eat();
    }
}
