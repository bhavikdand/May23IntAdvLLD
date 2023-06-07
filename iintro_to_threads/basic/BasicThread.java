package iintro_to_threads.basic;

public class BasicThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am in a thread:" + Thread.currentThread().getName());
    }
}
