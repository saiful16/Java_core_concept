public class EqualByThreeDecimalPlaces {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        long firstRound = (long) (number1 * 1000);
        long secondRound = (long) (number2 * 1000);
        return firstRound == secondRound;
    }
//gitHub repo connection check
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(23.456,23.457));
    }
}

//connection check

