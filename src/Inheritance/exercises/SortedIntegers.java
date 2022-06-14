package Inheritance.exercises;

import java.util.List;

public class SortedIntegers extends Integers {

    public SortedIntegers(List<Integer> array) {
        super(array);
    }

    @Override
    public void append(Integer in) {
        if (in > array.get(array.size()-1)) array.add(in);
        else System.out.println("Invalid value");
    }

    @Override
    public void addElement(Integer index, Integer input) {
        if (input < array.get(index+1) && input > array.get(index-1)) {
            array.set(index, input);
        }
        else {
            System.out.println("Invalid index, try again");
        }
    }

    @Override
    public void addElement (Integer number) {
        for (int k = 0; k < array.size(); k++) {
            if (k == 0) {
                if (number < array.get(k)) {
                    array.add(k, number);
                    break;
                }
            }
            else {
                if (k < array.size() - 1) {
                    if (number < array.get(k + 1) && number > array.get(k - 1)) {
                        array.add(k + 1, number);
                        break;
                    }
                } else {
                    if (number > array.get(k))
                        array.add(number);
                        break;
                }
            }
        }
    }
}
