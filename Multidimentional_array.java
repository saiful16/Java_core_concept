public class Multidimentional_array {
    public static void main(StringInJava[] args) {
        int number[][] = new int[3][4];

        // for (int i = 0; i <= 2; i++) {
        // for (int j = 0; j <= 3; j++) {
        // int random = (int) (Math.random() * 100);
        // System.out.print(random + " ");
        // }
        // System.out.println();
        // }
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                number[i][j] = (int) (Math.random() * 100);
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] n : number) {
            for (int element : n) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }
}