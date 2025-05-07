package JavaMasterClass.TimBuchalka.IfThenConditionalLogic;

public class Challenge {
    public static void main(String[] args) {
        double doubleValue = 20.00d;
        double doubleSecondValue = 90.00d;

        double sumDoubleValue = doubleValue + doubleSecondValue;
        double muliplyDoubleValue = sumDoubleValue*100d;

        double remainder = muliplyDoubleValue%40.00d;
        System.out.println(remainder);

        boolean nonZeroValidate = (remainder == 0);
        System.out.println(nonZeroValidate);

        if (!nonZeroValidate) {
            System.out.println("got some remainder");
        }


    }
}
