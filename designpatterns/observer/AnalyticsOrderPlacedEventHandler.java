package designpatterns.observer;

public class AnalyticsOrderPlacedEventHandler implements OrderPlacedEventHandler{

    public AnalyticsOrderPlacedEventHandler() {
        Publisher.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Raising analytics event");
    }

    @Override
    public void unregister() {
        Publisher.getInstance().unregister(this);
    }
}
