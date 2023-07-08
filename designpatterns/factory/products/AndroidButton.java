package designpatterns.factory.products;

public class AndroidButton implements Button {
    @Override
    public void renderButton() {
        System.out.println("Rendering android button");
    }
}
