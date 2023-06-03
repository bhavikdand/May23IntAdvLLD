package inheritance_demo.example_2;

public class Example2 {

    public static void main(String[] args) {
        inheritance_demo.example_2.C c = new inheritance_demo.example_2.C();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A{
//    private B() {   <- Inheritance chain is getting broken here
//        System.out.println("B");
//    }
}

class C extends inheritance_demo.example_2.B {
    public C() {
        System.out.println("C");
    }
}
