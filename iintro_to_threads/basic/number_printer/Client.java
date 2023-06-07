package iintro_to_threads.basic.number_printer;

public class Client {

    public static void main(String[] args) {
        OddNumberPrinter oddNumberPrinter = new OddNumberPrinter();
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter();
        Thread t1 = new Thread(oddNumberPrinter);
        Thread t2 = new Thread(evenNumberPrinter);
        t1.start();
        t2.start();
    }
}
