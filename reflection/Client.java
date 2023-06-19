package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Student student = new Student("ABC", 20);
        System.out.println(student.name);
//        student.name = "XYZ";
//        student.age = 45;
        System.out.println(student.getAge());

        Field[] declaredFields = student.getClass().getDeclaredFields();
        System.out.println("----------Printing class attributes----------");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        for (Field declaredField : declaredFields) {
            if(declaredField.getName().equals("age")){
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(student));
            }
        }

        System.out.println("-----------Printing class members----------------");

        Method[] declaredMethods = Student.class.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }


        for (Method declaredMethod : declaredMethods) {
//            if(declaredMethod.getName().equals("privatePrint")){
//                declaredMethod.setAccessible(true);
//                declaredMethod.invoke(student);
//            }

            if(declaredMethod.getName().equals("print")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null);
            }
        }

    }
}
