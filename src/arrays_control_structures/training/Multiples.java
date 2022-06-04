package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.List;

public class Multiples {

    private Integer number;
    private List<Integer> result;
    public Multiples (Integer number) {
        this.number = number;
        result = new ArrayList<Integer>();
    }

    public List<Integer> divisors () {
        for (int k = 1; k < number; k ++) {
            if (number % k == 0)
                result.add(k);
        }
        return result;
    }

    public static void main (String [] args) {
        Multiples m = new Multiples(20);
        System.out.println(m.divisors());
    }

}
