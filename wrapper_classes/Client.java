package wrapper_classes;

public class Client {
    public static void main(String[] args) {
        int i = 3;
        Integer integer = new Integer(5);
        Integer integer1 = 3; // Auto boxing
        int j = integer; // Unboxing
        System.out.println("DEBUG");
        int i1 = Integer.parseInt("20");
        Integer integer2 = Integer.valueOf("30");
        System.out.println();

        Object obj = new Object();
        obj = new Integer(5);
//        obj = new Animal();

        Animal animal = (Animal) obj;
    }
}

class Animal{

}
