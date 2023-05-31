package constructors;

public class Client {

    public static void main(String[] args) {
        StudentWithDefaultConstructor defaultConstructor = new StudentWithDefaultConstructor();
        System.out.println(defaultConstructor.name);
        System.out.println(defaultConstructor.age);

        System.out.println("-----------------------");
        StudentsWithNoArgsConstructor noArgsConstructor = new StudentsWithNoArgsConstructor();
        System.out.println(noArgsConstructor.name);
        System.out.println(noArgsConstructor.age);

        System.out.println("-----------------------");
        // StudentWithSingleParameterizedConstructor singleParameterizedConstructor = new StudentWithSingleParameterizedConstructor();  <- Because no matching constructor in the class
        StudentWithSingleParameterizedConstructor singleParameterizedConstructor =
                new StudentWithSingleParameterizedConstructor("Bhavik", 26);
        singleParameterizedConstructor.print();

        System.out.println("--------------------");
        StudentsWithMultipleConstructors st1 = new StudentsWithMultipleConstructors();
        StudentsWithMultipleConstructors st2 = new StudentsWithMultipleConstructors(26, "Stanford");
    }
}
