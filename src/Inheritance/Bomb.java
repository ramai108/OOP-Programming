package Inheritance;

public class Bomb extends Enemy {

    public Bomb (int x, int y, String name, int speed) {
        super(x,y,name,speed);
    }

    @Override
    public void strike() {

    }

    public void attack() {}

    public void Move(Direction d) {
        switch (d) {
            case RIGHT ->  super.Move(d);
            case LEFT -> super.Move(d);
            case UPWARD -> y -= getSpeed();
            case DOWNWARD ->  y += getSpeed();
        }
    }

    public void Move (Spy p) {
        Move(p.x > this.x ? Direction.RIGHT : Direction.LEFT );
        Move(p.y > this.y ? Direction.RIGHT : Direction.LEFT );
    }

}
