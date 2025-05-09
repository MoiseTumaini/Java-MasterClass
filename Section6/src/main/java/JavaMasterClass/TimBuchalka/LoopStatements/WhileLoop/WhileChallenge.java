package JavaMasterClass.TimBuchalka.LoopStatements.WhileLoop;

public class WhileChallenge {
    /**
     * <p> Step 1: </p>
     * <p> Create a method called isEvenNumber that takes a parameter of type int.
     *      Its purpose is to det. if the args passed is an even number or not </p>
     * <p> Next, Use a while loop to test a range of numbers from 5 up to 20 (inclusive),
     *      only printing out the even numbers determined from calling isEvenNumber method.</p>
     * <p> Step 2: </p>
     * <p> Modify the while code to make it also record the total number of even numbers
     *      it has found. </p>
     * <p> Break out of the loop once 5 even numbers are found. </p>
     * <p> Finally, display the total number of odd and even numbers found. </p>
     */

//    step 1
//    public static void main(String[] args) {
//        int number = 5;
//        while (number <= 20) {
//            if (isEvenNumber(number)) {
//                System.out.println("Even Number = " + number);
//            }
//            number++;
//        }
//    }
//
//    public static boolean isEvenNumber(int number) {
//        return number % 2 == 0;
//    }

//    step 2
    public static void main(String[] args) {
        int number = 5;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20 && evenCount < 5) {
            if (isEvenNumber(number)) {
                System.out.println("Even Number = " + number);
                evenCount++;
            } else oddCount++;
            number++;
        }
        System.out.println("Total Even Numbers = " + evenCount);
        System.out.println("Total Odd Numbers = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
