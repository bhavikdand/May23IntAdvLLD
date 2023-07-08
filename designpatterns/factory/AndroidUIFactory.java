package designpatterns.factory;

import designpatterns.factory.products.AndroidButton;
import designpatterns.factory.products.AndroidMenu;
import designpatterns.factory.products.Button;
import designpatterns.factory.products.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }
}
