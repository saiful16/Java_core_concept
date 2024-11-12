public class StringInJava {
   public static void main(String[] args) {
    String firstName = new String("Md Saiful");
    String lastName = "Islam";
    System.out.println("First name is : "+ firstName + " Last Name is : "+ lastName);
    System.out.println(firstName.length());

    StringBuffer sb = new StringBuffer("Saiful");

    System.out.println(sb.length());
}
}
