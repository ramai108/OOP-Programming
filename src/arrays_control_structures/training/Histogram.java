package arrays_control_structures.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Histogram {

    private Map<String,List<Double>> grades = new HashMap<String, List<Double>>();

    public Histogram () {
        grades.put("Ramai Alexandria", Arrays.asList(9.5,10.0,8.5,9.5));
        grades.put("Erica Vaccari",Arrays.asList(6.0,6.5,8.0,8.5));
        grades.put("Niloy Islam",Arrays.asList(7.5,7.25,4.0,5.0));
        grades.put("Florian Sottili",Arrays.asList(4.5,5.5,6.0,4.0));
        grades.put("Fiha Kham",Arrays.asList(6.5,5.5,4.5,5.0));
    }
    public Integer getMaxLength () {
        Integer dim = 0;
        for (String item : grades.keySet()) {
            if (item.length() > dim )
                dim = item.length();
        }
        return dim;
    }

    public String finalGrades () {
        String output = "";
        for (Map.Entry<String,List<Double>> grades: grades.entrySet()) {
            String key = grades.getKey();
            Integer sumval = grades.getValue().stream().mapToInt(i -> i.intValue()).sum();
            Integer avg = sumval / grades.getValue().size();
            Integer diff = getMaxLength() - key.length() + 4;
            if (key.length() < getMaxLength()) {
                output += key + " ".repeat(diff) + avg.toString();
            }
            else {
                output += key + "    " + avg.toString();
            }
            output += "\n";
        }
        return output;
    }

    public void saveGrades () {
        Path fname = Path.of("school-grades.txt");
        String content = finalGrades();
        try {
            Files.writeString(fname,content);
        } catch (IOException e) {
            System.out.println("Fatal error");
        }
    }

    public static void main(String[] args) {
        Histogram h = new Histogram();
        h.saveGrades();
    }
}
