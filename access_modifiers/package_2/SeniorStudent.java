package access_modifiers.package_2;

import access_modifiers.package_1.Student;

public class SeniorStudent extends Student {

    public void printSeniorStudent(){
        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.email); <- because diff package
        System.out.println(this.psp);
    }
}
