class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(StringInJava[] args) {

        Calculator obj = new Calculator();
        int r1 = obj.add(2,3);
        System.out.println(r1);

        int r2 = obj.add(5, 5, 5);
        System.out.println(r2);

        double r3 = obj.add(6, 5);
        System.out.println(r3);

        double r4 = obj.add(2, 2, 2);
        System.out.println(r4);
    }
}