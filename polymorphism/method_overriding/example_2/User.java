package polymorphism.method_overriding.example_2;

public class User{
    String username;

    public User(String username) {
        this.username = username;
    }

    void login(){
        System.out.println("User " + username+ " is logging in");
    }

    void showDashboard(){
        System.out.println("Showing dashboard to user");
    }
}

class Instructor extends User {

    public Instructor(String username){
        super(username);
    }

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

    void login(){
        System.out.println("Instructor: " + username + " is logging in!");
    }

    void showDashboard(){
        System.out.println("Rendering batches assigned to instructor");
    }
}

class Mentor extends User{

    public Mentor(String username) {
        super(username);
    }

    void login(){
        System.out.println("Mentor: " + username + " is logging in!");
    }

    void showDashboard(){
        System.out.println("Showing learners assigned to mentor");
    }
}
