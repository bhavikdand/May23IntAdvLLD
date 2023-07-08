package designpatterns.prototype;

public class Client {

    public static final String STUDENT = "STUDENT";
    public static final String INTELLIGENT_STUDENT = "INTELLIGENT_STUDENT";

    public static void main(String[] args) {
        StudentRegistry registry = setupAndGetRegistry();
        Student student = registry.get(STUDENT);
        Student clone = student.copy();

        Student intelligentStudent = registry.get(INTELLIGENT_STUDENT);
        Student intelligentStudentClone = intelligentStudent.copy();
        IntelligentStudent is = (IntelligentStudent) intelligentStudentClone;
        System.out.println(is.iq);
        System.out.println("DEBUG");
    }

    private static StudentRegistry setupAndGetRegistry() {
        StudentRegistry registry = new StudentRegistry();
        registry.register(STUDENT,
                new Student(20, "John Doe", "john@doe.com", "Stanford"));
        registry.register(INTELLIGENT_STUDENT, new IntelligentStudent(20, "Jane Doe", "jane@doe.com", "Harvard", 200));
        return registry;
    }
}
