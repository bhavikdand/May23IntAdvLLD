package mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Count c = new Count();
        Adder adder = new Adder(c, lock);
        Subtractor subtractor = new Subtractor(c, lock);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(c.num);
    }
}
