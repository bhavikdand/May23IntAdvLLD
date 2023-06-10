package callables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception{
        RandomNumberGenerator rg = new RandomNumberGenerator();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> futureRandomNumberObj = executorService.submit(rg);
        // Make an API call to service 1
        // Make an API call to service 2
        System.out.println("Main thread is not attempting to access the value from callable");
        System.out.println("Data from callable: " + futureRandomNumberObj.get());
        executorService.shutdown();
    }
}
