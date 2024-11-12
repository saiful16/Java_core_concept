public class Switch {
    public static void main(StringInJava[] args) {
        int n = 2;

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter valid number");
        }
        int x = 5;

        int y = 10;

        int z = (x++ > 5 && y-- < 10) ? x-- : y;
        System.out.println(z);
        System.out.print(x);
        System.out.println(y);
    }
}
