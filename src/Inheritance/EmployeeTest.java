package Inheritance;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1  = new PaidEmployee("Ramai","Alexandria",1900);
        Employee e2 = new PieceWorkEmployee("Ramai","Alexandria",10,5);

        System.out.println(e1);
        System.out.println(e2);
    }
}
