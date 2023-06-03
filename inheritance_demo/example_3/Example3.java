package inheritance_demo.example_3;

public class Example3 {

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
//    public B(String s) {    <- C's constructor looks for default/no-args constructor, which is not available in B
//        System.out.println("B" + s);
//    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}
