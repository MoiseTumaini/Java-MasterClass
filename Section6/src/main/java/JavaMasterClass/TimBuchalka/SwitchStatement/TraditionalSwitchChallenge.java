package JavaMasterClass.TimBuchalka.SwitchStatement;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char natoChar = 'A';

        switch (natoChar) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found in the switch statement");
        }
    }
}
