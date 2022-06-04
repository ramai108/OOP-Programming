package arrays_control_structures.training;

public class DrawFrame {

    public static void main(String[] args) {
        int n = 5;
        for (int j = 0; j < n ; j ++) {
            for (int i = 0; i < n ; i ++) {
                if (j == 0 || j == n -1) {
                    System.out.print(" * ");
                }
                else if (i == 0 || i == n - 1) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
