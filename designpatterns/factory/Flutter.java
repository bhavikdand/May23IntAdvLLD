package designpatterns.factory;

public class Flutter {

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory getUIFactoryByPlatform(Platform platform){
        if(platform.equals(Platform.ANDROID)){
            return new AndroidUIFactory();
        }else if (platform.equals(Platform.IOS)){
            return new IosUIFactory();
        }
        throw new UnsupportedOperationException("Unsupported platform");
    }

}
