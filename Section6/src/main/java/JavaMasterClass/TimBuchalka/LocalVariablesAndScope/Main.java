package JavaMasterClass.TimBuchalka.LocalVariablesAndScope;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(11));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;
        else if (number%10 == number) return number*2;

        int firstDigit = 0;
        int lastDigit = number%10;

        while (number != 0){
            int digit = number%10;
            number = number/10;

            if (number == 0) {
                firstDigit = digit;
            }
        }
        return firstDigit + lastDigit;
    }
}
