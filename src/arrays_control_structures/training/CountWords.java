package arrays_control_structures.training;

public class CountWords {

    public String text;
    public String word;
    public CountWords (String text, String word) {
        this.text = text;
        this.word = word;
    }
    public int countW () {
        int counter = 0;
        String [] divide = text.split(" ");
        for (String item : divide)
            if (item.equals(word))
                counter ++;
        return counter;
    }

    public static void main (String [] args) {
        CountWords cw = new CountWords("the greatest of the greatest is here","greatest");
        System.out.println(cw.countW());
    }

}
