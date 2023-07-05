package designpatterns.builder.prod;


import designpatterns.builder.basic.StudentBuilder;

public class Client {
    public static void main(String[] args) {
//        Student.StudentBuilder sb = new Student.StudentBuilder();
        /*
        Steps to convert from basic to prod version of builder:
        1. We made StudentBuilder class an inner static class.
        2. Changed setters to return the StudentBuilder object.
        3. Created a public static method getBuilder inside Student
        4. Now chain the setters to get rid of the Builder class from client
        5. Create a build method which simply returns the student object.
        6. Make the student constructor private.
         */

        Student student = Student.getBuilder()
                        .setAge(20)
                        .setEmail("test@scaler.com")
                        .setName("John Doe")
                        .setGradYear(2018)
                        .setPsp(90.0d)
                        .setUniversity("LPU")
                        .setPhoneNumber("+123")
                        .build();

//        Student s = new Student(sb);
        System.out.println("DEBUG");

        A.B obj = new A().new B();
        System.out.println(obj.b);

        A.C objc = new A.C();
        System.out.println(objc.c);
    }
}

class A{
    String a;
    class B{
        String b;
    }
    static class C{
        String c;
    }
}
