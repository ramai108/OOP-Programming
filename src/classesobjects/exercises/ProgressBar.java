package classesobjects.exercises;

public class ProgressBar {
    private int percentage;

    public ProgressBar(int percentage) {
        this.percentage = percentage;
    }

    public void increase(int value) {
        percentage += value;
    }

    public void decrease(int value) {
        percentage -= value;
    }

    public String toString() {
        return String.valueOf(percentage) + "%";
    }

    public static void main(String[] args) {

        ProgressBar pb = new ProgressBar(0);
        pb.increase(20);
        pb.increase(25);
        System.out.println(pb.toString());

    }
}
