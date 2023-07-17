package designpatterns.observer;

public class Client {

    public static void main(String[] args) {
        TransportationOrderEventHandler transportationOrderEventHandler = new TransportationOrderEventHandler();
        SellerOrderEventHandler sellerOrderEventHandler = new SellerOrderEventHandler();
        AnalyticsOrderPlacedEventHandler analyticsOrderPlacedEventHandler = new AnalyticsOrderPlacedEventHandler();

        Publisher.getInstance().orderPlaced();
        System.out.println("--------------------");
        sellerOrderEventHandler.unregister();

        Publisher.getInstance().orderPlaced();
    }
}
