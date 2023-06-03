package polymorphism.method_overriding.example_1;

public class A {

    public void print(){
        System.out.println("A");
    }

}

class B extends A{
    @Override
    public void print() {
        System.out.println("B");
    }
}

class C extends B{
    @Override
    public void print() {
        System.out.println("C");
    }
}
