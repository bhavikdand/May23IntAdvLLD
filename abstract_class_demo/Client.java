package abstract_class_demo;

public class Client {

    public static void main(String[] args) {
//        Animal a = new Animal();  <- cannot create obj of an abstract class
        Animal dog = new Dog();
        dog.walk();
    }
}
