package arrays_control_structures.training;

public class EarthQuake {

    private double magnitude;

    public EarthQuake (double magnitude){
        this.magnitude = magnitude;
    }

    public String toString () {
        if (magnitude >= 8.0) return "The Majority of the buildings will get destroyed";
        else if (magnitude >= 7.0) return "Several buildings will get destroyed";
        else if (magnitude >= 6.0) return "Several buildings will get damaged, whilst others will get destroyed";
        else if (magnitude >= 4.5) return "Only poorly designed buildings will get damaged";
        else if (magnitude >= 3.5) return "Earthquake will be felt, but there won't be significant destruction";
        else if (magnitude >= 0) return "Nothing";
        else return "Invalid negative value";
    }

    public static void main (String [] args) {

        EarthQuake eq = new EarthQuake(8.0);
        System.out.println(eq.toString());

    }

}
