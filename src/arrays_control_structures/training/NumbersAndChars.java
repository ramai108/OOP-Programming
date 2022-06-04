package arrays_control_structures.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersAndChars {

    private String input;
    private String output = "";
    public NumbersAndChars (String input) {
        this.input = input;
    }
    public String convertToChars () {
        Map<String,String> values = new HashMap<String,String>();
        values.put("0","zero");
        values.put("1","one");
        values.put("2","two");
        values.put("3","three");
        values.put("4","four");
        values.put("5","five");
        values.put("6","six");
        values.put("7","seven");
        values.put("8","eight");
        values.put("9","nine");
        String [] array = input.split("");
        for (String ch : array) {
            output += values.get(ch) + " ";
        }
        return output;
    }

    public String converToCharsadv() {

        Map<String, List<String>> valnum = new HashMap <String, List<String>>();
        valnum.put("1", Arrays.asList("one","ten","one-hundred","one-thousand"));
        valnum.put("2", Arrays.asList("two","twenty","two-hundred","two-thousand"));
        valnum.put("3", Arrays.asList("three","thirty","three-hundred","three-thousand"));
        valnum.put("4", Arrays.asList("four","fourty","four-hundred","four-thousand"));
        valnum.put("5", Arrays.asList("five","fifty","five-hundred","five-thousand"));
        valnum.put("6", Arrays.asList("six","sixty","six-hundred","six-thousand"));
        valnum.put("7", Arrays.asList("seven","seventy","seven-hundred","seven-thousand"));
        valnum.put("8", Arrays.asList("eight","eighteen","eight-hundred","eight-thousand"));
        valnum.put("9", Arrays.asList("nine","ninety","nine-hundred","nine-thousand"));

        int length = input.length()-1;
        String[] arr = input.split("");
        for (String item : arr) {
            output += valnum.get(item).get(length) + " ";
            length --;
        }
        return output;
    }
    public static void main (String [] args) {
        NumbersAndChars ntc = new NumbersAndChars("7672");
        // System.out.println(ntc.convertToChars());
        System.out.println(ntc.converToCharsadv());
    }
}
