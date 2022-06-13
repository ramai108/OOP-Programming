package Inheritance;

public class X {

    public X(int k) {System.out.println(k);}
    public void print() {System.out.println("X!");}

    public X clone ()  {
        //creates a copy of this and returns it }

        return null;
    }

    public static void main(String[] args) {
        X x = new X(10);
        Y y = new Y();
        x.print();
        y.print();
    }
}

class Y extends X {

    public Y() {super(10);}
    public void print() {System.out.println("Y!"); super.print();}

    @Override
    public Y clone () {
        return new Y();
    }

    public void clone(X x) {
    }

    private void clone (int k) {
    }
}



