package designpatterns.factory;

import designpatterns.factory.products.Button;
import designpatterns.factory.products.Menu;

public interface UIFactory {

    Menu createMenu();
    Button createButton();
}
