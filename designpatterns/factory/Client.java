package designpatterns.factory;

import designpatterns.factory.products.Button;
import designpatterns.factory.products.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryByPlatform(Platform.IOS);

        Button button = uiFactory.createButton();
        button.renderButton();

        Menu menu = uiFactory.createMenu();
        menu.renderMenu();
    }
}
