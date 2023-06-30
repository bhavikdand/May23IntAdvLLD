package method_hiding;

public class Client {
    public static void main(String[] args) {
        A a1 = new B();
        A a2 = new B();

        a1.abc();
        a1.xyz();
    }
}

class A{
    public void abc(){
        System.out.println("ABC -> A");
    }

    public static void xyz(){
        System.out.println("XYZ -> A");
    }
}

class B extends A{
    @Override
    public void abc() {
        System.out.println("ABC -> B");
    }

    public static void xyz(){
        System.out.println("XYZ -> B");
    }
}
