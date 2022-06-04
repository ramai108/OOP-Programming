package classesobjects.exercises;

public class User {
    private String name;
    private String lastname;

    public User () {}

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void printInfo () {
        System.out.println(getName() + " " + getLastname());
    }

    public static void main (String [] args) {
        User u = new User("Ramai","Alexandria");
        u.printInfo();
    }


}
