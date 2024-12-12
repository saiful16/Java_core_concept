public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double height, double length){
        if(height < 0 || length < 0) {
            return -1;
        }
        return height * length;
    }

    public static void main(String[] args) {
        double areaOfCircle = area(-3.5);
        System.out.println("Area of Circle is " + areaOfCircle);
        double areaOfTriangle = area(2.5,-3);
        System.out.println("Area of Triangle is " + areaOfTriangle);
    }
}
