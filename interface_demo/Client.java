package interface_demo;

public class Client {

    public static void main(String[] args) {
//        Animal animal = new Animal();  <- Not allowed
        Animal animal = new Dog();
//        animal.wagTail()  <- Cannot access child's attrs/methods from Animals reference
        animal.walk();

    }
}
