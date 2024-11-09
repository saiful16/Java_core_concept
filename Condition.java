public class Condition {
    public static void main(String[] args) {
        int x = 8;

        if (x> 5 && x < 10)
        System.out.println("Hello");
        else
        System.out.println("Bye");

        int y = 17;
        int z = 9;
        if (x>y && x > z) {
            System.out.println(x);
        }else if (y> x && y > z){
            System.out.println(y);
        }else 
        System.out.println(z);
    }
}
