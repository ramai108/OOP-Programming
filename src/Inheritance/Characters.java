package Inheritance;

public class Characters extends Entity{

    private String name;
    private int speed;

    public enum Direction  {
        RIGHT,LEFT,UPWARD,DOWNWARD
    }

    public Characters(int x, int y, String name, int speed) {
        super(x,y);
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void Move(Direction d) {
        switch (d)  {
            case RIGHT ->  x += speed;
            case LEFT -> x -= speed;
            default -> System.out.println("Invalid Direction");
        }
    }
}
