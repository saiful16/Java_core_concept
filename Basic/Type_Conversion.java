package Basic;

import javax.sound.sampled.SourceDataLine;

public class Type_Conversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        b = (byte) a ;

        System.out.println(a);
    }

}
