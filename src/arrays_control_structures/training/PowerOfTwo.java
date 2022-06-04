package arrays_control_structures.training;

public class PowerOfTwo {
    public static void main (String [] args) {
        final int N = Integer.parseInt(args[0]);

        int val = 1;
        int i = 0;

        while (i <= N) {
            System.out.println(i + " " + val);
            val *=2;
            i ++;
        }
    }
}
