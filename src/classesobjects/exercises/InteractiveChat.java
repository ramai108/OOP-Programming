package classesobjects.exercises;

import java.util.Scanner;

public class InteractiveChat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String input = sc.next();
        System.out.println("Hello " + input);
    }

}
