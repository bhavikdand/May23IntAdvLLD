package designpatterns.factory.products;

public class AndroidMenu implements Menu{
    @Override
    public void renderMenu() {
        System.out.println("Rendering Android Menu");
    }
}
