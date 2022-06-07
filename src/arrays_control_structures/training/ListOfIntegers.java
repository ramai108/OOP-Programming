package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfIntegers {

    List<Integer> numbers = new ArrayList<Integer>();

    public ListOfIntegers (List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer getElement(Integer index) {
        return numbers.get(index);
    }

    public Integer indexOfElement(Integer number) {
        return numbers.indexOf(number);
    }

    public String format() {
        return numbers.toString();
    }

    public Integer getLength() {
        return numbers.size();
    }

    public boolean isPresent(Integer number){
        return numbers.contains(number);
    }

    public void addElement(Integer number) {
        numbers.add(number);
    }

    public void addElementAtIndex(Integer index, Integer number) {
        numbers.set(index,number);
    }

    public void removeElement(Integer number) {
        numbers.remove(number);
    }

    public void removeElementAtIndex(Integer index) {
        numbers.remove(index);
    }

    public static void main(String[] args) {

        ListOfIntegers in = new ListOfIntegers(Arrays.asList(5,9,10,32,58));
        System.out.println(in.isPresent(4));

    }
}
