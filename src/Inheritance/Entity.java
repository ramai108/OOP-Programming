package Inheritance;

public abstract class Entity {

    protected int x;
    protected int y;

    public Entity (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Entity() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
