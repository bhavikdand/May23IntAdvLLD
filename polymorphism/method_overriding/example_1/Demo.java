package polymorphism.method_overriding.example_1;

import java.util.Random;

public class Demo {

    public static A getObj(){
        Random random = new Random();
        int i = random.nextInt();
        if(i%3 == 0){
            return new A();
        }
        if(i%3 == 1){
            return new B();
        }
        if(i%3==2){
            return new C();
        }
        return new A();
    }

    public static void main(String[] args) {
        for(int i=0; i< 100; i++) {
            A a = getObj();
            a.print();
        }
    }
}
