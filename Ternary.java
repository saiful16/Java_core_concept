public class Ternary {
    public static void main(StringInJava[] args) {
        int x = 4;
        int result = 0;

        // if (x%2==0){
        //     result = 10;
        //     System.out.println(result);
        // }
        // else{
        //     result = 20;
        //     System.out.println(result);
        // }

        result = x % 2 ==0 ? 10 : 20;
        System.out.println(result);
    }
}
