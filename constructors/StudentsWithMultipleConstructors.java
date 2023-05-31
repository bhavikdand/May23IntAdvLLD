package constructors;

public class StudentsWithMultipleConstructors {

    String name;
    int age;
    String university;

    public StudentsWithMultipleConstructors(){
        this.name = "ABC";
        this.age = 20;
        this.university = "Stanford";
    }

    public StudentsWithMultipleConstructors(String name, int age){
        this.name = name;
        this.age = age;
    }

//    public StudentsWithMultipleConstructors(String university, int age){
//        this.university = university;
//        this.age = age;
//    } This won't work because of clashing signatures

    public StudentsWithMultipleConstructors(int age, String university){
        this.university = university;
        this.age = age;
    }
}
