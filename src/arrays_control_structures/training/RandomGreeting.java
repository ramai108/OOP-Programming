package arrays_control_structures.training;

import java.util.Random;

public class RandomGreeting {

    public void sayHello () {
        String hello = null;

        switch(new Random().nextInt(6)) {
            case 0 : hello = "hello" ; break;
            case 1:  hello = "hola" ; break;
            case 2 : hello = "buon giorno" ; break;
            case 3 : hello = "buondi" ; break;
            default: hello =  "good morning"; break;
        }
        System.out.println(hello);
    }

    public static void main (String [] args) {
        new RandomGreeting().sayHello();
    }
}
