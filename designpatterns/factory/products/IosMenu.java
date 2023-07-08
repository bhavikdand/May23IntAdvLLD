package designpatterns.factory.products;

public class IosMenu implements Menu{
    @Override
    public void renderMenu() {
        System.out.println("Rendering IOS Menu");
    }
}
