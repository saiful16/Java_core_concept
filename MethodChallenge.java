public class MethodChallenge {
    public static void main(String[] args) {

       int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jhon", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Kim", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Speed", playerPosition);

        playerPosition = calculateHighScorePosition(-   90);
        displayHighScorePosition("Lee", playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " menage to get position " + playerPosition);
    }

    public static int calculateHighScorePosition(int playerScore){
        int playerPosition = 0;

        if(playerScore >= 1000){
            playerPosition = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            playerPosition = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            playerPosition = 3;
        } else {
            playerPosition = 4;
        }
        return playerPosition;
    }
}
