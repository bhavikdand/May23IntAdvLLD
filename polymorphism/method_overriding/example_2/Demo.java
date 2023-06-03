package polymorphism.method_overriding.example_2;


import java.util.Random;

public class Demo {

    public static User getObj(){
        Random random = new Random();
        int i = random.nextInt();
        if(i%2 == 0){
            return new Mentor(String.valueOf(i));
        }
        if(i%2 == 1){
            return new Instructor(String.valueOf(i));
        }
        return new User(String.valueOf(i));
    }

    public static void main(String[] args) {

//        String userType = "M";
//        if(userType.equals("M")){
//            Mentor m = new Mentor("str");
//            m.login();
//            m.showDashboard();
//        } else if (userType.equals("I")) {
//            Instructor i = new Instructor("str");
//            i.login();
//            i.showDashboard();
//        }
        for(int i=0; i<10;i++) {
            User s = getObj();
            s.login();
            s.showDashboard();
            System.out.println("---------------------");
        }

    }
}
