package classesobjects.exercises;

public class Rectangle {

    private int x1;
    private int y1;
    private int height;
    private int width;

    private Colors color = Colors.BLACK;
    int X1 = x1;
    int Y1 = y1;

    public Rectangle(int x1, int y1, int height, int width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;
        this.X1 = x1;
        this.Y1 = y1;
    }
    public void move (int x2, int y2) {
        x1 += x2;
        y1 += y2;
    }
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public void setColor(Colors c) {
        color = c;
    }

    public Colors getColor () {
        return color;
    }

    public String toString () {
        return "(" + X1 +"," + Y1 + ")" + "-> " + "(" + getX1() +"," + getY1() + ")";
    }

    public static void main (String [] args) {
        Rectangle r = new Rectangle(30,15,300,200);
        r.move(54,72);
        System.out.println(r.toString());
        System.out.println( r.getColor());
        r.setColor(Colors.RED);
        System.out.println( r.getColor());
    }

}
