package designpatterns.prototype;

public class Student implements Prototype{
    private int age;

    String name;
    String email;
    String university;

    public Student(int age, String name, String email, String university) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.university = university;
    }

    public Student(Student original){
        this.age = original.age;
        this.name = original.name;
        this.email = original.email;
        this.university = original.university;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
