package JavaMasterClass.TimBuchalka;

public class Main {
    public static void main(String[] args) {
        double kilometers = (100*1.609344);     //converting miles to km

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;   // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
    }
}

