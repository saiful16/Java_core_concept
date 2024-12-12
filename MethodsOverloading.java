public class MethodsOverloading {
    public static int calculatScore(String playserName, int score){
        System.out.println("Playser name is " + playserName + " and has " + score + " points");
        return score * 1000;

    }

    public static int calculatScore( int score){
        System.out.println("Unnamed Player has " + score + " points");
        return score * 1000;
    }

    public static int calculatScore(){
        System.out.println("No player name no score");
        return 0;
    }




    public static void main(String[] args) {
//        calculatScore("Saiful" , 500);

        int newScore = calculatScore("Saiful" , 500);
        System.out.println("New score is " + newScore);

        calculatScore(50);
        calculatScore();
    }
}
