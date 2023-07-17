package designpatterns.observer;

public interface OrderPlacedEventHandler {
    void handle();

    void unregister();
}
