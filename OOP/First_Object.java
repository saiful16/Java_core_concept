package OOP;

class Calculator{
    public int add(int a, int b){
        int addition = a + b;
        return addition;
    }
}
public class First_Object {
    public static void main(String[] args) {
        int num1 = 3;
        int num2= 5;

        // int result = num1 + num2;
        calculator calculator = new calculator();
        int result = calculator.add(num1, num2);

        System.out.println(result);
    }
}
