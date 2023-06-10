package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Client {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<100; i++){
            NumberPrinter np = new NumberPrinter(i);
            executorService.execute(np);
        }
        executorService.shutdown();
    }
}
