package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        VeryImportantClass annotation = Student.class.getAnnotation(VeryImportantClass.class);
        if(annotation != null){
            System.out.println("This class is very important");
        }
        else {
            System.out.println("This class is not important");
        }

        Student student = new Student("Bhavik", 20);

        Method[] declaredMethods = Student.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            ImportantMethod importantMethod = declaredMethod.getAnnotation(ImportantMethod.class);
            if(importantMethod != null){
                System.out.println("This annotation is present on this method:" + declaredMethod.getName() );
                for(int i=0; i < importantMethod.times(); i++) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(student);
                }
            }
        }
    }
}
