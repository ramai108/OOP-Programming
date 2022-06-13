package more_into_objects;

/**
 * Class that represents a month
 */

public class Month {

    private int month;
    public Month (int month) {
        // here we are required to make sure that the month is valid
        this.month = month;
    }

    public int toInt() {return month; }

    public String toString() {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "doesnt exist";
        };
    }

    public static void main(String[] args) {
        Month m = new Month(12);
     //   System.out.println(m.toString());

     /*   TheMonth tm = TheMonth.NOVEMBER;
        System.out.println(tm.toString());*/
        TheMonth [] values = TheMonth.values();
        for (TheMonth item: values) {
            System.out.println(item);
        }

        TheMonth december = TheMonth.valueOf("DECEMBER");
        System.out.println(december);
        System.out.println(december = TheMonth.DECEMBER);

        int [] whole  = {1,1,1,0,0,0,1,0,1,0,1,1,0,0,1};
        for (int k : whole) {
            System.out.println(Integer.valueOf(k));
        }

        boolean b = new Integer(5) == new Integer(5);
        System.out.println(5 == 5 );
        System.out.println(new Integer(5).compareTo(new Integer(3)));

        int j = 42;
        Integer i = Integer.valueOf(j);
        Double  d = Double.valueOf(42.0);
        Character c = Character.valueOf('x');

        Integer k = 3;
        Character cx = 'x';
        Double d42 = 42.0 + 5 + d;
        Boolean b2 = false;
        int h = k;
        double y = d42;
        Integer [] array = {2,3,2,0,1};
        Integer [] array2 = {Integer.valueOf(2),Integer.valueOf(3),Integer.valueOf(0)};
    }
}
