public class JaggedArray {
    public static void main(StringInJava[] args) {
        int number[][] = new int[4][];
        number[0] = new int[3];
        number[1] = new int[4];
        number[2] = new int[2];
        number[3] = new int[5];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int n[] : number) {
            for (int element : n) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int thirdDimentionArray [][][] = new int [4][4][5];

        for(int i =0; i < thirdDimentionArray.length; i++){
            for(int j = 0; j < thirdDimentionArray[i].length; j++){
                for(int k =0; k < thirdDimentionArray[i][j].length; k++){
                    thirdDimentionArray[i][j][k] = (int) (Math.random()*100);
                }
            }
        }

        for(int n [][] : thirdDimentionArray){
            for(int m[]  : n){
                for(int element : m){
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
