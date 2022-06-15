package Inheritance;

import java.util.*;

public class HackedString {

    private String s;

    public HackedString(String s) {
        this.s = s;
    }
    public String toString () {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int k = 0; k < s.length(); k++) {

            char c = s.charAt(k);
            if (random.nextBoolean()) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        HackedString hs = new HackedString("drago della programmazione");
        FramedHackedString fhs = new FramedHackedString("drago della programazione");

        System.out.println(hs);
        System.out.println(fhs);
    }

}
