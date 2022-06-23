package junit;

import java.util.ArrayList;

public class IntVector {

    ArrayList<Integer> list = new ArrayList<>();

    public IntVector (int ... values) {
        for (int v : values) list.add(v);
    }

    public void add (int v) {list.add(v); }

    public IntVector getCopy() {
        try {
            return (IntVector)clone();
        }
        catch (CloneNotSupportedException e) {return null; }
    }

}
