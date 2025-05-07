package JavaMasterClass.TimBuchalka.StatementsWhiteSpacesAndIndenting;

public class Main {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;   // This is also a complete statement
        myVariable--;

        /* These are also valid statements, however not recommended since
            it may be difficult to read for others and yourself.
         */

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);
    }
}
