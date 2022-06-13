package Inheritance;

public class Robot extends Enemy {
    public Robot (int x, int y, String name, int speed ) {
        super(x, y, name, speed);
    }

    @Override
    public void strike() {

    }

    public void burn() {}
    public void attack () {}
}
