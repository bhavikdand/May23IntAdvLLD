package constructors;

public class StudentWithSingleParameterizedConstructor {

    String name;
    int age;

    public StudentWithSingleParameterizedConstructor(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println(name + " " + age);
    }
}
