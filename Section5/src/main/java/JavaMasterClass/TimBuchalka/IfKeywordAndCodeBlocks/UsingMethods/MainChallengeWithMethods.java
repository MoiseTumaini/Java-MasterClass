package JavaMasterClass.TimBuchalka.IfKeywordAndCodeBlocks.UsingMethods;

public class MainChallengeWithMethods {
    public static void main(String[] args) {

        System.out.println("The highscore is " +
                calculateScore(true,800,5,100));
        System.out.println("the highscore is " +
                calculateScore(true,10_000,8,200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;

    }
}
