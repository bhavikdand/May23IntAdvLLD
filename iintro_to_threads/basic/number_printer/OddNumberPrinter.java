package iintro_to_threads.basic.number_printer;

public class OddNumberPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<100; i=i+2){
            System.out.println("I am odd: " + i);
        }
    }
}
