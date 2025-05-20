package JavaMasterClass.TimBuchalka.ParsingInputs;

import java.util.Scanner;

/**
 * <p> You'll be using an endless loop which:
 * <ul>
 *     <li> Prompts the user to enter a number or any character to quit. </li>
 *     <li> Validates if the user-entered data really is a number. You can choose either an integer or double validation method. </li>
 *     <li> If the user-entered data is not a number, quit the loop. </li>
 *     <li> Keep track of the minimum number entered. </li>
 *     <li> Keep track of the maximum number entered. </li>
 * </ul>
 * </p>
 *
 * <p> If the user has previously entered a set of numbers (or even just one), display the minimum and muximum number that the user entered. </p>
 */

public class MinAndMaxChallenge {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        double max = 0;<<<>><<<<<<<<<<
//        double min = 0;
//        int count = 0;<>
//
//        boolean validInput = false;
//
//        while (true){
//            System.out.println("Enter a number, or any character to exit:");
//            String nextEntry = scanner.nextLine();
//            try{
//                double validNum = Double.parseDouble(nextEntry);
//                if (count == 0 || validNum < min) min = validNum;
//                if (count == 0 || validNum > max) max = validNum;
//
//                count++;
//
//            } catch (NumberFormatException nfe){
//                break;
//            }
//        }
//
//        if (count > 0){
//            System.out.println("min = " + min + ", max = " + max);
//        } else {
//            System.out.println("No valid data entered");
//        }
//    }
public static void inputThenPrintSum(){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    int ave = 0;

    while (true){
        try{
            int input = scanner.nextInt();
            sum += input;
            count++;

            ave = sum/count;

        } catch (NumberFormatException nfe){
            break;
        }
    }

    if (count > 1){
        System.out.println("SUM = " + sum + " AVG = " + ave);
    } else {
        System.out.println("Invalid Input");
    }
}
}
