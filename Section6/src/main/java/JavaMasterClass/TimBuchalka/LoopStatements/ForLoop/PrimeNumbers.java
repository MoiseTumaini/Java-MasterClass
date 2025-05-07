package JavaMasterClass.TimBuchalka.LoopStatements.ForLoop;

public class PrimeNumbers {
    /**
     * <p> A prime number is a whole number above 1 that cannot be made by multiplying other whole numbers. </p>
     * <p> (If we can make it by multiplying other whole numbers it is a Composite Number) </p>
     */
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "": "NOT") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "": "NOT") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "": "NOT") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "": "NOT") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "": "NOT") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "": "NOT") + "a prime number");
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * <p>We can improve the isPrime method. we can iterate over the halfway number</p>
     */

    public static boolean newIsPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber/2 ; divisor++) {
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
