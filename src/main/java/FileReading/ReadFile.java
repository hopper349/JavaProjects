package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args)  {
        //taking inputs from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String line = scanner.nextLine();
        System.out.println("Your Name is " + line);
        scanner.close();

        //reading from file
        try {
            File file = new File(System.getProperty("user.dir") + "//src//main//java//FileReading//Abc.txt");
            Scanner scanner2 = new Scanner(file);
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
