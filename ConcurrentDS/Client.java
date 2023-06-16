package ConcurrentDS;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        ai.decrementAndGet();
        ai.getAndDecrement();

    }
}
