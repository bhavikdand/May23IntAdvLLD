package designpatterns.factory;

import designpatterns.factory.products.Button;
import designpatterns.factory.products.IosButton;
import designpatterns.factory.products.IosMenu;
import designpatterns.factory.products.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosButton createButton() {
        return new IosButton();
    }
}
