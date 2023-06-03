package inheritance_demo;

public class Demo {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        System.out.println(i.username);
        System.out.println(i.avgRating);
        i.login();
    }

}

class User{
    String username;
    void login(){
        System.out.println("User is logging in");
    }
}

class Instructor extends User{
    double avgRating;
    String batchName;
    void scheduleClass(){
        System.out.println("Instructor is scheduling class");
    }
}
