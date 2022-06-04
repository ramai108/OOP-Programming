package arrays_control_structures.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VerticalString {

    private String input;
    private String out = "";

    public VerticalString (String input) {
        this.input = input;
    }
    public String [] getWords () {
        String [] splitted = input.split(" ");
        return splitted;
    }

    public int getLargestWord() {
        int value = 0;
        for (String item : getWords()) {
            if (item.length() > value)
                value = item.length();
        }
        return value;
    }
    public String[][] buildMatrix () {

        String [] swords = getWords();
        String [][] matrix = new String [getLargestWord()][swords.length];

        for(int y = 0; y < matrix.length; y ++) {
            for (int x = 0; x < matrix[y].length; x ++) {
                matrix[y][x] = " ";
            }
        }
        for (int j = 0; j < swords.length; j ++) {
            for (int i = 0; i < swords[j].length(); i ++) {
                String character = swords[j].substring(i,i+1);
                matrix[i][j] = character;
            }
        }
        return matrix;
    }

    public String toString () {
        String[][] mtx = buildMatrix();
        for (int y = 0 ; y < mtx.length; y ++) {
            for (int x = 0; x < mtx[y].length; x++) {
                String c = mtx[y][x];
                out += c + " ";
            }
            out += "\n";
        }

        return out;
    }

    public void saveStrings () {

        Path filename = Path.of("strings.txt");
        String content = toString();
        try {
            Files.writeString(filename, content);
        } catch (IOException e) {
            System.out.println("Fatal error");
        }
    }

    public static void main (String [] args) {
        VerticalString vs = new VerticalString("Ramai Alexandria is a Senior Software Engineer");
        vs.saveStrings();
    }

}
