package OOP;

public class AdvancedCalculator extends Calculator{
    public int multi(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println(calc.add(7, 5));
        System.out.println(calc.div(15, 5));
        System.out.println(calc.multi(3, 5));
        
        VeryAdvCalc obj = new VeryAdvCalc();
        System.out.println(obj.add(4, 8));
        System.out.println(obj.power(2, 3));
        System.out.println(obj.add(2, 2));
    }
    
}

class VeryAdvCalc extends AdvancedCalculator{
    public double power(int a, int b){
        return Math.pow(a, b);
    }

    public int add(int a, int b){
        return a+b+1;
    }
    
}
