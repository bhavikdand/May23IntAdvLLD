package polymorphism.method_overloading;

public class Printer {

    void print(){
        System.out.println("No parameters here");
    }

    void print(String s){
        System.out.println("Hello! " + s);
    }
}
