package designpatterns.decorator;

public class Chocochips extends IngredientsDecorator {

    public Chocochips(Ingredients baseIcecream) {
        super(baseIcecream);
    }

    @Override
    public int getCost() {
        return baseIcecream.getCost() + 15;
    }
}
