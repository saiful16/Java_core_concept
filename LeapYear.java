public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year <=1 || year >= 9999){
            return false;
        }
        else{
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true;
                    }
                }return false;
            }return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2016));

        }
}
