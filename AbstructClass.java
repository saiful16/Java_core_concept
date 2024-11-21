abstract class Car{

    // must need to abstract keyword before both methods and class
    // abstract methods must be implemented in concreat class 
    public abstract void drive();
    public void music(){
        System.out.println("Play music..");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("driving..");
    }
}

public class AbstructClass {

    public static void main(String[] args) {
// we cannot creat a object of a abstract class 
        // Car obj1 = new Car();
        WagonR obj = new WagonR();
        obj.drive();
        obj.music();
    }
    
}