package abstract_class_demo;

public abstract class Animal {

    String name;
    int age;

    public void print(){
        System.out.println(name);
    }

     abstract void walk();
}

class Dog extends Animal{

    @Override
    void walk() {
        System.out.println("Dog is walking");
    }
}
