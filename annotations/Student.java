package annotations;

@VeryImportantClass
public class Student {

    public String name;
    private int age;

    private static String university = "LPU";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @ImportantMethod(times = 3)
    public void publicPrint(){
        System.out.println(name);
    }

    @ImportantMethod()
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
