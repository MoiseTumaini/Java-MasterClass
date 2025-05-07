package JavaMasterClass.TimBuchalka.LoopStatements.ForLoop;

public class MiniChallenge {
    /**
     * <ul>
     *     <li> Call the calculateInterest method with the dollar amount 100. </li>
     *     <li> Use the interest rate between 7.5 and 10, but increment by a quarter of a percent each time, meaning 0.25 percent. </li>
     *     <li> Print the results to the console window </li>
     * </ul>
     */

    public static double calculateInterest(double amount, double rate){
        return amount * (rate/100);
    }

    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0 ; rate += 0.25) {
            System.out.println("$100 at " + rate + "% interest = " + calculateInterest(100, rate));
            if (rate >= 8.5) {
                break;
            }
        }
    }
}
