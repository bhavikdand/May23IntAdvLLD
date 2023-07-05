package designpatterns.builder.basic;

public class Student {

    String name;
    String email;

    String phoneNumber;

    int age;
    String university;
    int gradYear;
    double psp;

    public Student(StudentBuilder sb){
        if(sb.email == null){
            throw new RuntimeException("Email cannot be null");
        }
        if(sb.age < 18){
            throw new RuntimeException("Age cannot be less than 18");
        }
        this.age = sb.age;
        this.university = sb.university;
        this.gradYear = sb.gradYear;
        this.psp = sb.psp;
        this.name = sb.name;
        this.email = sb.email;
        this.phoneNumber = sb.phoneNumber;
    }
}
