package JavaMasterClass.TimBuchalka.IfKeywordAndCodeBlocks.UsingMethods;

public class MethodChallenge {
    // My Solution
//    public static void main(String[] args) {
//        System.out.println( displayHighScorePosition("Moise", calculateHighScorePosition(1500)) );
//        System.out.println( displayHighScorePosition("Tim", calculateHighScorePosition(1000)) );
//        System.out.println( displayHighScorePosition("Mark", calculateHighScorePosition(500)) );
//        System.out.println( displayHighScorePosition("Luke", calculateHighScorePosition(100)) );
//        System.out.println( displayHighScorePosition("John", calculateHighScorePosition(25)) );
//    }
//
//    public static String displayHighScorePosition(String playerName, int playerPosition){
//        return playerName + " managed to get into position " + playerPosition + " on the high score list";
//    }
//
//    public static int calculateHighScorePosition(int playerScore){
//        int result;
//        if (playerScore >= 1000) result = 1;
//        else if (playerScore >= 500 && playerScore < 1000 ) result = 2;
//        else if (playerScore >= 100 && playerScore < 500) result = 3;
//        else result = 4;
//
//        return  result;
//    }

    // Tim's Solution
    public static void main(String[] args) {
         displayHighScorePosition("Moise", calculateHighScorePosition(1500));
         displayHighScorePosition("Tim", calculateHighScorePosition(1000));
         displayHighScorePosition("Mark", calculateHighScorePosition(500));
         displayHighScorePosition("Luke", calculateHighScorePosition(100));
         displayHighScorePosition("John", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int result = 4;

        if (playerScore >= 1000) result = 1;
        else if (playerScore >= 500) result = 2;
        else if (playerScore >= 100) result = 3;

        return result;
    }
}
