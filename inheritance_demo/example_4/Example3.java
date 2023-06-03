package inheritance_demo.example_4;

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
    public B(){
        System.out.println("B");
    }
    public B(String s) {
        System.out.println("B:" + s);
    }
}

class C extends B {
    public C() {
        super("Hey");
        System.out.println("C");
    }
}
