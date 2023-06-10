package static_demo;

public class Client {

    private Client(){}

    public static void main(String[] args) {
        Student st = new Student();
        Student.university = "LPU";
        System.out.println(Student.university);
        Student.university = "Stanford";
        System.out.println(Student.university);
        System.out.println(st.university);
        Student.printStudentUniversity();
    }
}

