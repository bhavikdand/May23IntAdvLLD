package final_demo;

public class Client {

    public static void main(String[] args) {
        final int a = 5;
//        a = 10;
//        a = 20;
        final int b;
        b = 20;
//        b= 10;
    }
}

class A {
    int a;

    void print(){

    }
}

class B extends A{
    int b;

    void print(){

    }
}

class C {
    final int a;

    C(int a) {
        this.a = a;
    }

//    public C(int a){
//        this.a = a;
//    }

    public void manipulate(){
//        this.a = 5;
    }
}
