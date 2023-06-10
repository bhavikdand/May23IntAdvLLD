package synchronized_methods;

public class Count {

    private int num;

    public Count() {
        this.num = 0;
    }

    public synchronized void incrementValue(int offset){
        this.num += offset;
    }

    public synchronized void decrementValue(int offset){
        this.num -= offset;
    }
    public int get(){
        return this.num;
    }
}
