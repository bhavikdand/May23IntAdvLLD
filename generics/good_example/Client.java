package generics.good_example;

public class Client {

    public static void main(String[] args) {
        Printer<Integer, Integer> printer = new Printer<>(5, 10);
        printer.print();

        Printer<Double, Long> doublePrinter = new Printer<>(5.01d, 10L);
        doublePrinter.print();

        print("String");
        print(4);
        print(4.5D);
    }

    public static <T> void print(T thingToPrint){
        System.out.println(thingToPrint + " !!!!!!!");
    }
}
