package JavaMasterClass.TimBuchalka.LoopStatements.ForLoop;

public class Sum3And5Challenge {

    /**
     * <ul>
     *     <li> Create a for loop using a range of numbers from 1 to 1000 inclusive. </li>
     *     <li> Sum all the numbers that can be divided by both 3 and 5. </li>
     *     <li> Print out the numbers that have met the above conditions. </li>
     *     <li> Break out of the loop once you have found 5 numbers that met the conditions. </li>
     *     <li> After breaking out of the loop, print the sum of the numbers that met the conditions.</li>
     *     <li> Note: type all code in the main method </li>
     * </ul>
     * @param args
     */

//    my solution
    public static void main(String[] args) {

        for (int i = 1, cnt = 0, sum = 0; i <= 1000; i++) {
            if (i%5 == 0 && i%3 == 0) {
                sum += i;
                cnt++;
                System.out.println("Found a match = " + i);
            }

            if (cnt >= 5){
                System.out.println("Sum = " + sum);
                break;
            }
        }
    }
}
