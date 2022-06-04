package arrays_control_structures.training;

public class Array {

    public static void main (String [] args) {
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
