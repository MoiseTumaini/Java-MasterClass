package JavaMasterClass.TimBuchalka.ParsingInputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        // Manually getting inputs for calculations
//        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));

//        Using Scanner Class
        int currentYear = 2025;
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        }catch (NullPointerException e) {
//            System.out.println(getInputFromScanner(currentYear));
//        }

        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(new File("NameofFileOnFileSystem")); //Used to read inputs from a file

        // User input w/o validation
//        System.out.println("Hi, What's your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hi " + name + ", Thanks for taking the course!");
//
//        System.out.println("What year were you born? ");

        // User input with w/ validation
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                int dob = scanner.nextInt();
                age = checkData(currentYear,dob);
                validDOB = age < 0 ? false: true;
            } catch (InputMismatchException badUserData) {
                System.out.println(badUserData);
//                scanner.nextInt();
            }
        } while (!validDOB);


        return "So you are " + age + " years old";
    }

    public static int checkData(int cuurentYear, int dateofBirth){
        int minYear = cuurentYear - 125;

        if (dateofBirth < minYear || dateofBirth > cuurentYear) return -1;

        return cuurentYear - dateofBirth;
    }
}
