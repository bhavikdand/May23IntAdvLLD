package generics.good_example;

public class Printer<T,U>{

    T thingToPrint;
    U anotherThingToPrint;

    public Printer(T thingToPrint, U anotherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.anotherThingToPrint = anotherThingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
        System.out.println(anotherThingToPrint);
    }

}
