package JavaMasterClass.TimBuchalka.ParsingInputs;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    /**
     * <p> In this challenge, you'll read 5 valid numbers from the console entered by the user
     * and print the sum of those numbers. </p>
     *
     * <p> If the inputs are not valid numbers, print out the message "Invalid number" to the console,
     * but continue looping untill you have 5 valid numbers</p>
     *
     * <p> Before the user enters each number, prompt them with the message, "Enter number #x:"
     * where x represents the count 1,2,3, etc. </p>
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }

        System.out.println("The sum is: " + sum);
    }

    public static int getInputScanner(){

        return -1;
    }
}
