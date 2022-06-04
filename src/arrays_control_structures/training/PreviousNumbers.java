package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreviousNumbers {

    private Integer a;
    private Integer b;
    private Integer n;

    private List<Integer> array;

    public PreviousNumbers(Integer a, Integer b, Integer n) {
        this.a = a;
        this.b = b;
        this.n = n;
        array = new ArrayList<Integer>(Arrays.asList(a,b));
    }

    public List<Integer> getNumbers() {
        for (int k = 0; k < n; k ++) {
            int sum = array.get(array.size()-1) + array.get(array.size()-2);
            array.add(sum);
        }
        return array;
    }
    public static void main (String [] args) {
        PreviousNumbers pn = new PreviousNumbers(2,3,6);
        System.out.println(pn.getNumbers());
    }

}
