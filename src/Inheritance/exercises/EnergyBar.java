package Inheritance.exercises;

public class EnergyBar {

    private int length = 0;
    private final int maxlength = 10;
    private String bar = "=".repeat(maxlength);
    public EnergyBar () {
    }

    public void increase (int number) {
        length += number;
    }

    public int getLength() {
        return length;
    }

    public String toString () {
        String out = "";
        for (int k=0; k < bar.length(); k++) {
            if (k < getLength()) out += "O";
            else out += "=";
        }
        return out;
    }

    public String toStringPercentage() {
        String out = "";
        for (int k=0; k < bar.length(); k++) {
            if (k < getLength()) out += "O";
            else out += "=";
        }
        return out + " "+getLength() * 10 + "%";
    }

    public static void main(String[] args) {
        EnergyBar eb = new EnergyBar();
        eb.increase(2);
        eb.increase(4);
      //System.out.println(eb.toString());
        System.out.println(eb.toStringPercentage());
    }
}
