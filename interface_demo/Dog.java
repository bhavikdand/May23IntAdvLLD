package interface_demo;

public class Dog implements Animal{
    String breed;

    public void wagTail(){
        System.out.println("Dog is wagging their tails");
    }
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
