package adder_subtractor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Adder adder = new Adder(c);
        Subtractor subtractor = new Subtractor(c);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(c.num);
    }
}
