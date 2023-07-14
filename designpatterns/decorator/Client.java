package designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Ingredients icecream =  new Chocochips(
            new StrawberryScoop(
                new MangoSyrup(
                    new ChocoCone()
                )
            )
        );
        System.out.println(icecream.getCost());
    }
}
