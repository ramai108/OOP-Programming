package Inheritance.exercises.bankaccount;

public class Operation extends BankAccount {

    private String oplog = "OPERATIONS LOG \n\n" ;
    public Operation(Integer userId, String name, String surname, String IBAN, Double balance) {
        super(userId, name, surname, IBAN, balance);
    }
    public Operation() {
    }

    public void withdraw (Double amount, BankAccount user) {
        Double balance = user.getBalance();
        if (amount <= balance) {
            Double diff = balance - amount;
            user.setBalance(diff);
            oplog += user.getName().toString() + " has withdrawn " + amount + " euros \n";
        }
        else {
            System.out.println("The amount entered is greater than the current balance");
            oplog += user.getName().toString() + " has failed in attempting to withdraw " + amount + " euros \n";
        }
    }

    public void empty (BankAccount user) {
        user.setBalance(0.0);
        oplog += user.getName() + " has reset their bank balance to 0.0 \n";
    }

    public void recharge(Double amount, BankAccount user) {
        Double balance = user.getBalance();
        Double newbalance = balance + amount;
        user.setBalance(newbalance);
        oplog += user.getName() + " as added " + amount.toString() + "euros to his Bank Account" + " \n";
    }

    public void getCurrentBalance(BankAccount user) {
        System.out.println(user.getBalance());
        oplog += user.getName() + " 's current balance is " + user.getBalance() + "\n";
    }

    public void transferToAccount(BankAccount sender, BankAccount receiver, Double amount) {
        Double sbalance = sender.getBalance();
        Double rbalance = receiver.getBalance();
        Double sent = sbalance - amount;
        Double received = rbalance + amount;
        sender.setBalance(sent);
        receiver.setBalance(received);
        oplog += sender.getName() + " has sent "+ amount + " euros to " + receiver.getName() + "\n";
    }

    public String getOpLog() {
        return oplog;
    }

}
