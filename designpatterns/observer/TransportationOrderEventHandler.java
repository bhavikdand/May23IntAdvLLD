package designpatterns.observer;

public class TransportationOrderEventHandler implements OrderPlacedEventHandler{

    public TransportationOrderEventHandler(){
        Publisher.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Triggering transportation service");
        // API api call to /transportation/notify
    }

    @Override
    public void unregister() {
        Publisher.getInstance().unregister(this);
    }
}
