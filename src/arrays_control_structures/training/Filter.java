package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {

    List<Integer> numsequence = new ArrayList<Integer>();

    public Filter (List<Integer> numsequence) {
        this.numsequence = numsequence;
    }

    public List<Integer> lessThanK (Integer k) {
        List<Integer> less = new ArrayList<Integer>();
        for (Integer item : numsequence) {
            if (item <= k)
                less.add(item);
        }
        return less;
    }

    public List<Integer> greaterThanK (Integer k) {
        List<Integer> greater = new ArrayList<Integer>();
        for (Integer item : numsequence) {
            if (item >= k)
                greater.add(item);
        }
        return greater;
    }

    public List<Integer> applyFilter (Integer n) {
        List<Integer> f = new ArrayList<Integer>();
        for (Integer number : numsequence) {
            if (number != n)
                f.add(number);
        }
        return f;
    }

    public List<Integer> applyFilter(List<Integer> many) {
        List<Integer> g = new ArrayList<Integer>();
        for (Integer number: numsequence) {
            if (!many.contains(number))
                g.add(number);
        }
        return g;
    }

    public static void main(String[] args) {
        Filter f = new Filter(Arrays.asList(1,2,10,2,42,7,8));
        System.out.println(f.lessThanK(8));
        System.out.println(f.greaterThanK(9));
        System.out.println(f.applyFilter(2));
        System.out.println(f.applyFilter(Arrays.asList(2,7,42)));
    }
}
