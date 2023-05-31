package constructors;

public class StudentsWithNoArgsConstructor {
    String name;
    int age;

    public StudentsWithNoArgsConstructor(){
        this.name = "ABC";
        this.age = 20;
    }

    public void print(){
        System.out.println(name + " " + age);
    }
}
