package arrays_control_structures.training;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        String s = sb.reverse().toString();
        return s.equals(word);
    }

    public static void main (String [] args) {
        System.out.println(isPalindrome("oso"));
    }

}
