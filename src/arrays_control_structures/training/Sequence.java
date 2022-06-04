package arrays_control_structures.training;

import java.util.*;
import java.util.stream.Collectors;

public class Sequence {
    public List<Integer> numbers;

    public Sequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Map<Integer,Integer> getFrequencies() {
        Set<Integer> unique = numbers.stream().collect(Collectors.toSet());
        Map<Integer,Integer> values = new HashMap<Integer,Integer>();
        for (Integer item : unique) {
            Integer number = item;
            Integer frequence = Collections.frequency(numbers,item);
            values.put(frequence,number);
        }
        return values;
    }

    public Integer getMostFrequent() {
        Integer out = 0;
        Map <Integer,Integer> frequencies = getFrequencies();
        for (Map.Entry<Integer,Integer> entry : frequencies.entrySet() ) {
            if (entry.getKey() > out)
                out = entry.getKey();
        }
        return frequencies.get(out);
    }

    public Double getAverage() {
        Double sum = 0.0;
        for (Integer item : numbers)
            sum += item;
        Double avg = sum / numbers.size();
        return avg;
    }

    public List<Integer> getCenter () {
        Integer length = numbers.size();
        Integer center = length / 2;
        List<Integer> indexes = Arrays.asList(center-1,center,center+1);
        List<Integer> out = new ArrayList<Integer>();
        for (int k = 0; k < length ; k ++) {
            if (indexes.contains(Integer.valueOf(k)))
                out.add(numbers.get(Integer.valueOf(k)));
        }
        return out;
    }

    public static void main (String [] args) {
        Sequence s = new Sequence(Arrays.asList(1,1,5,9,23,7,98,45,45,45,45,45,45));
        //      System.out.println(s.getFrequencies());
        System.out.println(s.getAverage());
        System.out.println(s.getMostFrequent());
        System.out.println(s.getCenter());
    }
}
