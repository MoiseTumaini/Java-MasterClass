package JavaMasterClass.TimBuchalka.LoopStatements.ForLoop;

public class PrimeNumberChallenge {
    /**
     * <p> Create a prime number counter, that will keep count of how prime numbers were found. </p>
     * <p> Create a for statement, using any range of numbers, where the maximun number is <= 1000. </p>
     * <p> For each number in the range: </p>
     * <ul>
     *     <li> Check to see if it's a prime number using the isPrime method. </li>
     *     <li> If the number is prime, print it out and increment the prime number counter variable. </li>
     *     <li> Once the prime number counter equals three, exit the loop (Hint, use the break statement to exit). </li>
     * </ul>
     */

    public static boolean isPrime(int wholeNumber){
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

    public static void main(String[] args) {
        int start = 2, end = 20, count = 0;

        for (int i = start; count < 3 && i <= end; i++) {
            if (isPrime(i)){
                count += 1;
                System.out.println(i + " is the prime number number " + count);
            }
//            if (count == 3) {
//                break;
//            }
        }
    }


}
