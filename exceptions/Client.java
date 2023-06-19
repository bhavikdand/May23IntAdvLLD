package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {

    public static void main(String[] args)  {
//        readFile();
//        System.out.println("File is read");

        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException npe){
            System.out.println("NPE occured");
        }
        System.out.println("The end");
    }

    private static void readFile() {
        try {
            FileReader fileReader = new FileReader("scaler.txt");
        } catch (FileNotFoundException e){
            e.getMessage();
            System.out.println("File was not found");
        } finally {

            System.out.println("We are inside finally block");
        }
    }
}
