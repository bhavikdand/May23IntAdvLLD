package generics.advanced;


public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Printer<Dog> dogPrinter = new Printer<>(dog);
//        Printer<Dog> dogPrinter = new Printer<>(new Cat()); <- CTE: we are expecting Dog object
        dogPrinter.print();

//        Printer<Integer> integerPrinter = new Printer<>(5);  <- Compile time error since we are expecting child of Animal classes
    }
}
