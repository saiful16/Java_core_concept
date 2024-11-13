package OOP;

class Human{
    private int age; 
    private String name;
// Default constractor
    public Human(){
        age = 12;
        name = "jhon";
    }
// Constractor with parameter 
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
// getters
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
// setters 
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name=name;
    }


}

public class Encap {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human("saifuls", 22);

        // obj.setAge(28);
        // obj.setName("Saiful");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
