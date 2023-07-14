package designpatterns.decorator;

public class StrawberryScoop  extends IngredientsDecorator{

    public StrawberryScoop(Ingredients baseIcecream) {
        super(baseIcecream);
    }

    @Override
    public int getCost() {
        return baseIcecream.getCost() + 50;
    }
}
