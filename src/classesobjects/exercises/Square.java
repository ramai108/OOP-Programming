package classesobjects.exercises;

public class Square {

    private int s1;
    private int s2;
    private int s3;
    private int s4;

    public Square(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }
    public int getPerimeter() { return s1 + s2 + s3 + s4; }

    public static void main (String [] args ) {
        Square sq = new Square(21,50,70,58);
        System.out.println(sq.getPerimeter());
    }

}
