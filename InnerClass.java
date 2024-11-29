class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        A obj = new A(){
            public void show(){
                System.out.println("In New show");
                System.out.println("from inner class");
            }
        };
        

        obj.show();
        A obj1 = new A();
        obj1.show();
    }
    
}
