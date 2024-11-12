public class Array {
    public static void main(StringInJava[] args) {
        int num [] = {12, 2, 6};
        int numbers [] = new int[4];
        numbers[0]= 4;
        numbers[1]= 5;
        numbers[2]= 6;
        numbers[3]= 7;

        num[1] = 6;
        System.out.println(num[1]);

        for( int i = 0; i <= 3; i++){
            System.out.println(numbers[i]);
        }

    }
}
