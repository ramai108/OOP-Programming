package arrays_control_structures.training;

public class Converter {

    private int input;
    private int desiredbase;
    private String output = "";

    public Converter(int input, int desiredbase) {
        this.desiredbase = desiredbase;
        this.input = input;
    }
    public String convert() {
        int idx = input;
        while (idx > 0) {
            int remainder = idx % desiredbase;
            output += remainder;
            idx /= desiredbase;
        }
        StringBuilder sb = new StringBuilder(output);
        return sb.reverse().toString();
    }

}
