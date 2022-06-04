package classesobjects.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class CashRegister {

    private Double amount_given;
    private Double change;
    private Map<String,Double> cart = new HashMap<String,Double>();

    public CashRegister(Double amount_given) {
        this.amount_given = amount_given;
    }

    public void addProduct(String product, Double price, Integer amount) {
        cart.put(product,price * amount);
    }

    public Double getAmount_given() {
        return amount_given;
    }

    public Double getTotalAmount () {

        Double totalprice = 0.0;
        for (Double item : cart.values())
            totalprice += item;
        return totalprice;
    }

    public int longestString() {
        int word = 0;
        for (String w : cart.keySet()) {
            if (w.length() > word) {
                word = w.length();
            }
        }
        return word;
    }

    public Double getChange () {
        if (getAmount_given() >= getTotalAmount()) {
            change = getAmount_given() - getTotalAmount();
            return change;
        }
        else {
            return -1.0;
        }
    }
    public String getReceipt () {
        String receipt = "";
        int spacing = longestString() + 4;
        for (Map.Entry<String,Double> cart : cart.entrySet()) {
            String product = cart.getKey();
            String totalp = Double.toString(cart.getValue());
            if (product.length() < longestString()) {
                int diff = spacing - product.length();
                receipt += product + " ".repeat(diff)  + totalp + "€" + "\n";
            }
            else {
                receipt += product + " ".repeat(4) + totalp + "€" + "\n";
            }
        }

        receipt += "\n";
        receipt += "Total Amount: " + getTotalAmount().toString() + "\n";
        receipt += "Amount Given: " + getAmount_given().toString() + "\n";
        receipt += "Change: " + getChange().toString() + "\n";

        return receipt;
    }

    public void saveReceipt () {
        Path filename = Path.of("receipt.txt");
        String content = getReceipt();
        try {
            Files.writeString(filename,content);
        } catch (IOException e) {
            System.out.println("Fatal Error");
        }
    }

    public static void main (String [] args) {

        CashRegister cr = new CashRegister(100.0);
        cr.addProduct("Basmati Rice",3.10,2);
        cr.addProduct("Bananas",1.5,6);
        cr.addProduct("Water x 6 Pack",3.21,1);
        cr.addProduct("Oranges",1.5,8);
        cr.addProduct("Olive Oil",5.90,2);
        cr.addProduct("StrawBerries pack", 3.60,3);
        cr.addProduct("Baghette Bread",1.5,2);
        cr.addProduct("Red Apple",0.7,6);
        cr.addProduct("Spaghetti Gluten Free",1.80,2);
        cr.addProduct("Water Melon",5.0,2);
        cr.getReceipt();
        cr.saveReceipt();
    }

}
