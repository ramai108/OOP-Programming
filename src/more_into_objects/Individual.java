package more_into_objects;

public class Individual {

    private String name;
    private int age;

    public Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Individual p1 = new Individual("Ramai",25);
        Individual p2 = new Individual("Erica",22);
        //heap and stack
        String x = "hello";
        String y = x;
        char c = (char) 42;
    }
}
