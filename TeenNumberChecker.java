import org.w3c.dom.ranges.Range;

public class TeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3) {

        if (isTeen(number1) || isTeen(number2) || isTeen(number3)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number1) {

        if (number1 <= 19 && number1 >= 13) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(2,13,45));
    }
}

