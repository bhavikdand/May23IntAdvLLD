package callables;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Number generated is " + randomNumber);
        Thread.sleep(randomNumber * 1000L);
        System.out.println("Returning");
        return randomNumber;
    }
}
