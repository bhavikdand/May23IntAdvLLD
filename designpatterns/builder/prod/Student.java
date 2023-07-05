package designpatterns.builder.prod;


public class Student {

    String name;
    String email;

    String phoneNumber;

    int age;
    String university;
    int gradYear;
    double psp;

    private Student(StudentBuilder sb){
        if(sb.email == null){
            throw new RuntimeException("Email cannot be null");
        }
        if(sb.age < 18){
            throw new RuntimeException("Age cannot be less than 18");
        }
        this.age = sb.age;
        this.university = sb.university;
        this.gradYear = sb.gradYear;
        this.psp = sb.psp;
        this.name = sb.name;
        this.email = sb.email;
        this.phoneNumber = sb.phoneNumber;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

     static class StudentBuilder {
        Student s;
        String name;
        String email;

        String phoneNumber;

        int age;
        String university;
        int gradYear;
        double psp;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
