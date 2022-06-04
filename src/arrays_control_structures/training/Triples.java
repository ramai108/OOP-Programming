package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.List;

public class Triples {
    private Integer n;
    private List<Integer> numbers = new ArrayList<Integer>();

    public Triples (Integer n) {
        this.n = n;
    }

    public List<Integer> getPower() {
        for (int k = 1; k <= Integer.valueOf(n); k++)
            numbers.add(k * k);
        return numbers;
    }
    public void asTriples (){
        for (Integer numb : getPower()) {
            int v = numb;
            for (int j = 1; j <= v ; j++ ) {
                for (int i = 1 ; i <= v; i ++ ) {
                    if (j + i == v ) {
                        double a = Math.sqrt(j);
                        double b = Math.sqrt(i);
                        boolean alpha = ((a - Math.floor(a)) == 0);
                        boolean betha = ((b - Math.floor(b)) == 0);
                        if (alpha && betha && j < i) {
                            int ah = (int) Math.sqrt(j);
                            int bh = (int) Math.sqrt(i);
                            int ch = (int) Math.sqrt(v);
                            System.out.println(ah + " " + bh + " " + ch);
                        }
                    }
                }
            }
        }
    }
    public static void main (String [] args ) {
        Triples t = new Triples(15);
        t.asTriples();
    }

}
