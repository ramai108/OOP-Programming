package Inheritance.exercises.bankaccount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class BankAccount {

    private Integer userId;
    private String name;
    private String surname;
    private String IBAN;
    private Double balance;

    public BankAccount(Integer userId, String name, String surname, String IBAN, Double balance) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public BankAccount () {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public static void saveLog(Operation o) {
        Path fname = Path.of("transactions.txt");
        String content = o.getOpLog();
        try {
            Files.writeString(fname,content);
        } catch (IOException e) {
            System.out.println("Fatal error");
        }
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1,"Ramai","Alexandria","912ASB",9500.1);
        BankAccount a2 = new BankAccount(2,"Jodie","Lynne","189ASB",1782.6);
        BankAccount a3 = new BankAccount(3,"Michele","Bowie","459YBT",1882.0);
        BankAccount a4 = new BankAccount(4,"Kevin","Payano","195ASB",4702.0);
        BankAccount a5 = new BankAccount(5,"Visti","Larsen","570AFU",5912.0);
        BankAccount a6 = new BankAccount(6,"Sanjay","Rath","200ATG",2788.0);
        BankAccount a7 = new BankAccount(7,"Erica","Vaccari","289ASB",3782.0);

        Operation o1 = new Operation();
        o1.transferToAccount(a1,a7,700.0);
        o1.withdraw(500.0,a1);
        o1.recharge(1500.0,a1);
        o1.transferToAccount(a1,a3,453.15);
        o1.getCurrentBalance(a1);
        o1.withdraw(40.0,a1);
        o1.recharge(7450.0,a1);
        o1.getCurrentBalance(a1);
        o1.transferToAccount(a1,a7,350.0);
        o1.transferToAccount(a1,a5,285.50);
        o1.getCurrentBalance(a1);
        o1.getCurrentBalance(a7);
        saveLog(o1);

    }
}
