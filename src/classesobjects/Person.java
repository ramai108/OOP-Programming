package classesobjects;
public class Person {
    private String name;
    private String lastname;
    private static String country;
    public Person (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public Person () {

    }
    public String getName () {
        return name;
    }

    public String getLastName () {
        return lastname;
    }

    public String toString() {return name + " " + lastname;}

    public void greeting (Person friend) {
        System.out.println("Hello" + friend.name);
        System.out.println("Do you remember me? I am " + this.name );
    }
    public static void main (String [] args) {
        Person p1 = new Person("Ramai", "Alexandria");
        System.out.println(p1.getName());
        Person p2 = new Person("Visti", "Larsen");
        Person p3 = new Person();
        System.out.println(p3.getName());

        p1.greeting(p2);
        Person.country = "hello";

        String s1 = "ramai";
        System.out.println(s1.repeat(5));
    }
}
