package JavaMasterClass.TimBuchalka.IfKeywordAndCodeBlocks;

public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10_000; //
        int levelCompleted = 8;
        int bonus = 200;

        int finaScore =  score;

        if (gameOver){
            finaScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finaScore);
        }


    }
}
