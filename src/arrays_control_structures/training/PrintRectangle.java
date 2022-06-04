package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Hey, do insert the size of the rectangle you want to draw");

        Integer number = input.nextInt();
        Integer center = (number / 2)  ;
        int index = 0;

        List<Integer> indexes = new ArrayList<Integer>();
            indexes.add(center);
            for (int y = 0; y < number ; y++ ) {
            for (int x = 0; x < number; x ++) {
                if(indexes.contains(Integer.valueOf(x))) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            indexes.add(center - (Integer.valueOf(y+1)));
            indexes.add(center + (Integer.valueOf(y+1)));
            System.out.println();
            if(indexes.size() > number)
                break;
        }
    }
}
