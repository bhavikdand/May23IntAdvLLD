package static_demo;

public class Student {

    String name;
    int age;
    static String university;

    public static void printStudentUniversity(){
        System.out.println(university);
//        System.out.println(name);  <- name and age are obj level attributes, a static method cannot access them
//        System.out.println(age);
        printUni();
//        printStudentDetails();
    }

    public static void printUni(){
        System.out.println(university);
    }

    public void printStudentDetails(){
        System.out.println(name + " " + age);
        System.out.println(university);
        printUni();
    }

}
