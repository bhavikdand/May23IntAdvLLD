package designpatterns.builder.basic;

public class Client {

    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder();
        sb.setAge(15);
        sb.setEmail("test@scaler.com");
        sb.setName("John Doe");
        sb.setGradYear(2018);
        sb.setPsp(90.0d);
        sb.setUniversity("LPU");
        sb.setPhoneNumber("+123");
        Student s = new Student(sb);
        System.out.println("DEBUG");
    }
}
