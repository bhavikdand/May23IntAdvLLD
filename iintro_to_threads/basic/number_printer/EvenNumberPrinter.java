package iintro_to_threads.basic.number_printer;

public class EvenNumberPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i=i+2){
            System.out.println("I am even: " + i);
        }
    }
}
