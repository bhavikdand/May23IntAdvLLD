package generics.bad_example;

public class IntegerPrinter {

    Integer intToPrint;

    public IntegerPrinter(Integer intToPrint) {
        this.intToPrint = intToPrint;
    }

    public void print(){
        System.out.println(intToPrint);
    }
}
