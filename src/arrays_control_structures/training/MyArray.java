package arrays_control_structures.training;

import java.util.List;

public class MyArray {

    List<Integer> numbers;

    public MyArray (List<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean isPresent(Integer position, Integer number) {
        return numbers.get(position) == number;
    }

/*    public Integer elementsSum() {
        if (numbers.size() > 2) {
            return
        }
    }*/

    public static void main (String [] args) {

    }

}
