package access_modifiers.package_1;

public class Student {

    public String name;
    private int age;
    String email;
    protected double psp;

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.email);
        System.out.println(this.psp);
    }
}
