package designpatterns.observer;

public class SellerOrderEventHandler implements OrderPlacedEventHandler{

    public SellerOrderEventHandler() {
        Publisher.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Triggering seller service");
    }

    @Override
    public void unregister() {
        Publisher.getInstance().unregister(this);
    }


}
