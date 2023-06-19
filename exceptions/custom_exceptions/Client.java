package exceptions.custom_exceptions;

public class Client {

    public static void main(String[] args) {
        try {
            checkAge(5);
        } catch (RuntimeException re){
            System.out.println("RE happended");
        } catch (Exception e){
            System.out.println("Checked exception occured");
        }
        try{
            checkAge(20);
        } catch (RuntimeException re){
            System.out.println("RE happended");
        } catch (Exception e){
            System.out.println("Checked exception occured");
        }
    }

    private static void checkAge(int age) throws UnderAgeException{
        System.out.println("Checking age for: " + age);

        if(age < 18){
            throw new UnderAgeException("Your current age is " + age +", you cannot vote");
        }
        System.out.println("You are eligible to vote");
    }
}
