package polymorphism;

public class Demo {
    public static void main(String[] args) {

        User student = new Student("Bhavik", "July 2019", 80);

        User inst = new Instructor("Bhavik", 4.5D, "Nov Intermediate");;
        inst.login();
        System.out.println(inst.username);
        // inst.scheduleClass();

        student.login();
        System.out.println(student.username);
//        student.joinClass();

//        Student s = new User("ABC");
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

class Instructor extends User {

    public Instructor(String username, double avgRating, String batchName){
        super(username);
        this.avgRating = avgRating;
        this.batchName = batchName;
    }
    double avgRating;
    String batchName;
    void scheduleClass(){
        System.out.println(username);
        login();
        System.out.println("Instructor is scheduling class");
    }
}

class Student extends User{

    String batchName;
    double psp;

    public Student(String username, String batchName, double psp){
        super(username);
        this.batchName = batchName;
        this.psp = psp;
    }

    public void joinClass(){
        System.out.println("Student " + username + " is joining class");
    }
}
