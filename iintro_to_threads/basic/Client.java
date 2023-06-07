package iintro_to_threads.basic;

public class Client {

    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
