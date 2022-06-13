package Inheritance.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Integers {
    protected List<Integer> array;
    public Integers (List<Integer> array) {this.array = array; }

    public int getElement(Integer index) {return array.get(index); }

    public int getIndex(Integer input) {
        return array.indexOf(input);
    }

    public String printArray() { return array.toString();}

    public List<Integer> getArray() {
        return array;
    }

    public int getLength() { return array.size();}

    public boolean isPresent(Integer num){
        return array.contains(num);
    }

    public void append(Integer in) {
        array.add(in);
    }

    public void addElement(Integer index, Integer number) {
        array.set(index,number);
    }

    public void removeElement(Integer number) {
        array.remove(number);
    }

    public void removeElementAtIndex(Integer index) {
        array.remove(index);
    }

    public static void main(String[] args) {

        Integers it = new Integers (Arrays.asList(3,5,8,10));
        it.append(9);
    }
}
