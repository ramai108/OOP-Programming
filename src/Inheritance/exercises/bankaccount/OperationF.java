package Inheritance.exercises.bankaccount;

abstract public class OperationF {

    protected BankAccountFlexible bankAccountFlexible;
    public OperationF(BankAccountFlexible operationAccount) {
        bankAccountFlexible = operationAccount;
    }

    abstract double execute();
}

class WithDrawMoney extends OperationF {

    private double amountToSend;

    public WithDrawMoney (BankAccountFlexible receiverAccount , double amountToSend) {
        super(receiverAccount);
        this.amountToSend = amountToSend;
    }

    @Override
     double execute() {
        bankAccountFlexible.amount += amountToSend;
        return amountToSend;
    }
}

class EmptyAccount extends OperationF {

    public EmptyAccount (BankAccountFlexible receiverAccount) {
        super(receiverAccount);
    }
    double execute() {
        double balance = bankAccountFlexible.amount;
        bankAccountFlexible.amount = 0;
        return balance;
    }
}
class CurrentBalance extends OperationF {

    public CurrentBalance (BankAccountFlexible receiverAccount) {
        super(receiverAccount);
    }
    double execute() {
        System.out.println("Current Bank Account Balance : " + bankAccountFlexible.amount);
        return bankAccountFlexible.amount;
    }
}