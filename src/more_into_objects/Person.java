package more_into_objects;

public class Person {

    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
       /* SeedCard s = SeedCard.CUORI;
        s = SeedCard.FIORI;*/

        Person p1 = new Person("Ramai",25);
        Person p2 = new Person("Visti",40);


    }
}
