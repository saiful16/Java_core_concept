package OOP;

class Computer{
    public void ram(){
        System.out.println("You got a Computer ram");
    }

    public String ssd(int price){
        if( price >=10){
            return "you have the SSD";
        }
        else
        return "Please bring more amount";
    }
}

public class Method {
    public static void main(String[] args) {
        Computer comp = new Computer();

        comp.ram();
        System.out.println(comp.ssd(11));
    }
}
