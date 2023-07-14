package designpatterns.decorator;

public class ChocoCone implements Ingredients{

    public ChocoCone(){
    }

    @Override
    public int getCost() {
        return 50;
    }
}
