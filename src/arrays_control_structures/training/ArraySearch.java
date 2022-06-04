package arrays_control_structures.training;

import java.util.Arrays;

public class ArraySearch {

    public static boolean isPresent (String [] elements, String s) {
        for (String item : elements) {
            if (item.equals(s))
                return true;
        }
        return false;
    }

    public static int targetIndex(String [] elements, String s) {
        for (int k = 0; k < elements.length; k ++ ) {
            if (elements[k].equals(s))
                return k;
        }
        return -1;
    }

    public static double maxNumber(double ... numbers) {
        double max = Arrays.stream(numbers).max().getAsDouble();
        return max;
    }

    public static void main (String [] args) {
        System.out.println(maxNumber(9.5,8.3,10.0));
    }

}
