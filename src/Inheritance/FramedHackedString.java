package Inheritance;
import java.util.Random;

public class FramedHackedString extends HackedString {
    final public static int MAXIMUM_LENGTH = 10;
    public FramedHackedString (String s) {
        super(s);
    }
    public String getFrame() {
        Random random = new Random();
        int len = random.nextInt(MAXIMUM_LENGTH);
        StringBuffer sb = new StringBuffer();

        for (int k=0; k<len; k++) sb.append(k % 2 == 0 ? '-' : '=');
        return sb.toString();
    }

     public String toString () {
        String frame = getFrame();
        return frame + " " + super.toString() + " " + frame;
     }
}
