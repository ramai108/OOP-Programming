package arrays_control_structures.training;

public class StringUTF8 {

    public static String toString (int ... numbers) {
        String out = "";
        for (int item : numbers) {
            char character = (char) item;
            out += Character.toString(character);
        }
        return out;
    }

    public static void main (String [] args)  {
        System.out.println( toString(78,120,52,214,42));

    }
}
