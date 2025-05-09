package JavaMasterClass.TimBuchalka.LoopStatements.WhileLoop;

public class WhileLoopRecap {
    /**
     * <p> The following code provide a good summary of how while loops work
     *      with the continue and break statements. </p>
     * <h3> Helpful tips </h3>
     * <h4> Examining loops conditions</h4>
     * <ul>
     *     <li> When using loops, you want to carefully examine the conditions for terminating or
     *         continuing a loop. </li>
     *     <li> Check for endless or infinite loops. </li>
     *     <li> Check for conditions where a loop will never execute  </li>
     * </ul>
     * <h4> Continue and Break </h4>
     * <ul>
     *     <li> The continue and break statements both interrupt normal loop processing. </li>
     *     <li> The continue statement starts a new iteration but continues to iterate
     *          through the loop </li>
     *     <li> The break statement exits the loop at the point it's executed, and no longer             completes any code in the loop, and won't continue any longer. </li>
     * </ul>
     */

    public static void main(String[] args) {
        int number = 0;
        while (number < 15){
            number++;

            if (number <= 5){
                System.out.println("Skipping number = " + number);
                continue;
            }

            System.out.println("number = " + number);

            if (number >= 10){
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }

}
