package arrays_control_structures.training;

import java.util.ArrayList;

public class Array {

    public static void main (String [] args) {

        int [][] matrix = {{1,5},{2,4}};
        matrix.clone();

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);

        for (int k : a1) System.out.println(k);
        int k;
        Array a = new Array();
        int [] arrayOfIntegers = new int[10];
    }

    public int somma (int [] a ) {
        var k = 0;
   /*     for (int j=0 ; j < a.length; j++ )
            k += a[j];*/
        for (int v : a)
            k += v;
        return k;
    }
}
