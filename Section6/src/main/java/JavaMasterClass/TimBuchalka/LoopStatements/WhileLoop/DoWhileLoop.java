package JavaMasterClass.TimBuchalka.LoopStatements.WhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int j = 1;
        boolean isReady = false;
        do {
            if (j>5) break;

            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);
    }

    /**
     * <p> An example where a do while loop is necessary is when you'd like a user
     *      to enter a password/username at least once. If the input is incorrect,
     *      you would continue the iteration until it passes a condition. </p>
     */
}
