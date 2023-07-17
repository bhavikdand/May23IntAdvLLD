package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private static Publisher INSTANCE = null;
    private List<OrderPlacedEventHandler> eventHandlers;

    private  Publisher(){
        eventHandlers = new ArrayList<>();
    }

    public static Publisher getInstance(){
        if(INSTANCE == null){
            synchronized (Publisher.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Publisher();
                }
            }
        }
        return INSTANCE;
    }

    public void register(OrderPlacedEventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    public void unregister(OrderPlacedEventHandler eventHandler){
        if(eventHandlers.contains(eventHandler)) {
            eventHandlers.remove(eventHandler);
        }
    }

    public void orderPlaced(){
        for (OrderPlacedEventHandler eventHandler : eventHandlers) {
            eventHandler.handle();
        }
    }
}
