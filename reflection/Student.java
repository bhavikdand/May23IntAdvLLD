package reflection;

public class Student {

    public String name;
    private int age;

    private static String university = "LPU";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void privatePrint(){
        System.out.println(name);
    }

    private static void print(){
        System.out.println(university);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
