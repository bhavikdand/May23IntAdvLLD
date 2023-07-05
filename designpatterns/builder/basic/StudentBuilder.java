package designpatterns.builder.basic;

public class StudentBuilder {

    String name;
    String email;

    String phoneNumber;

    int age;
    String university;
    int gradYear;
    double psp;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
