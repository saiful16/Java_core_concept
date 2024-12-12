public class ConvertToCentimeter {

    public static double convertToCentimeters(double feet,double inch) {
        double finalInch = feet * 12 + inch;
        return convertToCentimeters(finalInch);
    }
    public static double convertToCentimeters(double inch) {
        return inch * 2.54;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,6));
    }
}
