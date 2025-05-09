package JavaMasterClass.TimBuchalka.LoopStatements.WhileLoop;

public class DigitSumChallenge {
    /**
     * <p> In this challenge, your task is to write a method with the name sumDigits
     *      that has a single parameter named number, of type int, and it should return an int. </p>
     *      <ul>
     *          <li> The method should only take a number that is positive. </li>
     *          <li> If a negative number is passed, it should return -1. </li>
     *          <li> The method should parse out each difit from the number and sum the digits up. </li>
     *      </ul>
     * <p> So, if 125 is passsed to the method, the code should sum up the digits, and return 8 as a value.</p>
     */

    public static void main(String[] args) {
        int number = 1;
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {
        int sumDigits = 0;
        int lastDigit;

        if (number < 0) return -1;

        while (number > 0){
            lastDigit = number%10;
            sumDigits += lastDigit;
            number = number/10;
        }
        return sumDigits;
    }

}
