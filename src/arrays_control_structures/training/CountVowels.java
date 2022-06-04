package arrays_control_structures.training;

import java.util.Arrays;
import java.util.List;

public class CountVowels {

    private String text;
    public CountVowels (String text) {
        this.text = text;
    }

    public List<String> getTotalCount () {
        int a = 0; int e = 0; int i = 0;
        int o = 0; int u = 0;

        for (int k = 0; k < text.length() ;k ++) {
            if (text.substring(k,k+1).equals("a")) {
                a++;
            }
            else if (text.substring(k,k+1).equals("e")) {
                e ++;
            }
            else if (text.substring(k,k+1).equals("i")) {
                i ++;
            }
            else if (text.substring(k,k+1).equals("o")) {
                o ++;
            }
            else if (text.substring(k,k+1).equals("u")) {
                u ++;
            }
        }
        List<String> out = Arrays.asList("a = " +a, "e = " +e, "i = " +i, "o = " +o, "u = " +u);
        return out;
    }

    public static void main (String [] args) {
        CountVowels cv = new CountVowels("le aiuole sono pulite");
        System.out.println( cv.getTotalCount());

    }

}
