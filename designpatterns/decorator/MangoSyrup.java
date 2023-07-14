package designpatterns.decorator;

public class MangoSyrup extends IngredientsDecorator{

    public MangoSyrup(Ingredients baseIcecream) {
        super(baseIcecream);
    }

    @Override
    public int getCost() {
        return baseIcecream.getCost() + 50;
    }
}
