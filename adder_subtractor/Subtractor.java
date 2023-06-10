package adder_subtractor;

public class Subtractor implements Runnable{
    Count c;

    public Subtractor(Count c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            this.c.num--;
        }
    }
}
