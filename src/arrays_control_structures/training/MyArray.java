package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyArray {
    List<Integer> numbers;
    public MyArray (List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean doesiTExist(Integer index, Integer number) {
        return numbers.get(index) == number;
    }

    public Integer firstTwo (){
        if (numbers.size() >= 2)
            return numbers.get(0) + numbers.get(1);
        else if (numbers.size() == 1 )
            return numbers.get(0);
        return 0;
    }

    public void exchangeValues(Integer idx1, Integer idx2) {
        Integer a = numbers.get(idx2);
        Integer b = numbers.get(idx1);
        numbers.set(idx1,a);
        numbers.set(idx2,b);
    }

    public List<Integer> getTriples() {
        List<Integer> triples = new ArrayList<Integer>();
        Integer center = numbers.size() / 2;
        for (int k=0;  k<numbers.size();k++) {
            if (k == 0 || k == center || k == numbers.size()-1) {
                triples.add(numbers.get(k));
            }
        }
        return triples;
    }

    public Integer maxTriples() {
        return Collections.max(getTriples());
    }

    public List<Integer> getTwo () {
        List<Integer> array = Arrays.asList(numbers.get(0),numbers.get(numbers.size()-1));
        return array;
    }
    public static void main (String [] args) {
        MyArray ma = new MyArray(Arrays.asList(1,7,5,3,0,2,2));
        System.out.println(ma.maxTriples());
    }
}
