class Mobile {
    String modelName;
    String brandName;
    int price;
    static String category;

    public void show() {
        System.out.println(modelName + " , " + brandName + " , " + price + " , " + category);
    }

    public static void show1(Mobile mobile){
        System.out.println(mobile.modelName + " , " + mobile.brandName + " , " + mobile.price + " , " + category);

    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brandName = "Apple";
        mobile1.modelName = "iphone 16 pro max";
        mobile1.price = 1100;
        Mobile.category = "SmartPhone";

        Mobile mobile2 = new Mobile();
        mobile2.brandName = "Samsung";
        mobile2.modelName = "Galaxy S24 Ultra";
        mobile2.price = 1300;

        mobile1.show();
        mobile2.show();

        Mobile.show1(mobile1);

    }
}
