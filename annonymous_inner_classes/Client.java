package annonymous_inner_classes;

public class Client {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hi there, I am in, " + Thread.currentThread().getName());


        Thread t = new Thread(r);
        t.start();

        Bird b = new Bird(){
            @Override
            public void fly() {
                System.out.println("Bird is flying");
            }

            @Override
            public void makeSound() {
                System.out.println("Bird is making sound");
            }
        };

        b.makeSound();
        b.fly();

        //Lambda expressions

        A a = x -> {
            System.out.println("Num is " + x);
            return x * x;
        };

        System.out.println(a.a(5));
    }
}

@FunctionalInterface
interface A{
    int a(int num);
//    void b();
}
