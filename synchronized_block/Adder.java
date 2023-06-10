package synchronized_block;

public class Adder implements Runnable{

    Count c;

    public Adder(Count c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            synchronized (c) {
                this.c.num++;
            }
        }
    }
}
