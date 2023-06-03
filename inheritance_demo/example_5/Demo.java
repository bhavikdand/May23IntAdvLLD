package inheritance_demo.example_5;

public class Demo {
    public static void main(String[] args) {
        Instructor i = new Instructor("Bhavik", 4.5D, "Nov Intermediate");
        System.out.println(i.username);
        System.out.println(i.avgRating);
        i.login();
    }

}

class User{
    String username;

    public User(String username) {
        this.username = username;
    }

    void login(){
        System.out.println("User " + username+ " is logging in");
    }
}

class Instructor extends User{

    public Instructor(String username, double avgRating, String batchName){
        super(username);
        this.avgRating = avgRating;
        this.batchName = batchName;
    }
    double avgRating;
    String batchName;
    void scheduleClass(){
        System.out.println("Instructor is scheduling class");
    }
}
