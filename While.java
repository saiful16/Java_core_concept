public class While {
    public static void main(StringInJava[] args) {
        int i =1;
        while (i<=4) {
            System.out.println("hello " + i);
            int j =1;
            while (j <=3) {
                System.out.println("Bye");
                j++;
            }
            i++;
        }

        int k =2;
        do{
            System.out.println("do while " + k);
            k++;
        }
        while(k <=3);
    }
}
