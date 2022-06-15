package Inheritance;

abstract public class Enemy extends Characters {

    public Enemy (int x, int y, String name, int speed) {
        super(x,y,name,speed);
    }

    abstract public void strike ();
}
