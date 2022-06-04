package arrays_control_structures.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MultiTable {

    public static int n = 5;
    private static String out = "";
    public static String buildTable() {

        int result = 0;
        for (int j = 1; j <= n; j++ ) {
            for (int i = 1; i <= n; i ++ ) {
                result = j * i ;
                out += Integer.toString(result) + "  ";
            }
            out += "\n";
        }
        return out;
    }

    public static void saveTable () {
        Path fname = Path.of("table.txt");
        String content = buildTable();
        try {
            Files.writeString(fname,content);
        }
        catch (IOException e) {
            System.out.println("Fatal Error");
        }
    }

    public static void main (String [] args) {
        saveTable();
    }
}
