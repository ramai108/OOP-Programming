package arrays_control_structures.training;

public class Jaguar {

    static public int k = 42;
    static public int get42() {return k;}

    public String read (char c) {
        switch (c) {
            case 'k' : return "kappa";
            case 'l' : return "elle";
            case 'c' : return "ci";
        }
        return "i cannot redy it";
    }

    public String read (int k) {
        String s = switch (k) {
            case 0 -> "zero";
            case 1 -> "zero";
            case 2 -> "zero";
            case 3 -> "zero";
            default -> "i cannot read it";
        };
        return s;
    }

    public static void main (String [] args) {
        get42();
        int j = new Jaguar().k;
        get42();

        int k = 42;
        if (k == 42) System.out.println("Yuppieee! ");
        else if (k == 41 ) System.out.println("lmao ...");
        else if (k > 50) {
            System.out.println();
        }
        else {
            if (k > 0) {
                if (j < 5 ) System.out.println("!!!");
                else System.out.println("j >= 5");
            }
            else {
                System.out.println("Hello world");
            }
        }

        j = 5;
        if (j > 3 ) k = j;
        else k = 0 ;
        k = j > 3 ? j : 0;

        String s = k > 3 ? (k < 5 ? "hello" : "xx") : "" + k;

        new Jaguar().countdown(4);
    }

    public void countdown (int k) {
        for (; k >= 0; k -- ) {
            System.out.println(k);
        }
        while (k >= 0)
            System.out.println(k--);
    }

}
