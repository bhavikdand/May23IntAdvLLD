package inheritance_demo;

public class Example1 {

    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A{
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}
