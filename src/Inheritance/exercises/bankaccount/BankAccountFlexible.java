package Inheritance.exercises.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountFlexible {
    private final String IBAN;
    public double amount;

    protected List<OperationF> operationsList = new ArrayList<OperationF>();

    public BankAccountFlexible(String IBAN) {
        this(IBAN,0.0);
    }

    public BankAccountFlexible(String iban, double initialAmount) {
        IBAN = iban;
        this.amount = initialAmount;
    }

    public double execute(OperationF o) {
        operationsList.add(o);
        return o.execute();
    }

    public List<OperationF> getOperations () {
        return new ArrayList<>(operationsList);
    }

    public static void main(String[] args) {

        BankAccountFlexible b = new BankAccountFlexible("DJWNA231F");
        b.execute(new WithDrawMoney(b,10.0));
        b.execute(new CurrentBalance(b));
        System.out.println(b.getOperations());
    }
}


