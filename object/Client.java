package object;

import java.util.HashSet;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student(20, "John Doe", "john@scaler.com");
        System.out.println(s1.toString());

        Student s2 = new Student(20, "John Doe", "john@scaler.com");
        if(s1.equals(s2)){
            System.out.println("Students are same");
        } else {
            System.out.println("Students are different");
        }

        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());

        System.out.println(s1.hashCode() + " " + s2.hashCode());
    }
}
