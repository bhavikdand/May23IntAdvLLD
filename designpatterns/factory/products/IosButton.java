package designpatterns.factory.products;

public class IosButton implements Button{
    @Override
    public void renderButton() {
        System.out.println("Rendering iOS button");
    }
}
