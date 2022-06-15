package Inheritance;

public class PieceWorkEmployee extends Employee {

    private double payPerProduct;
    private int processedProduct;


    public PieceWorkEmployee(String name, String id, double payPerProduct, int processedProduct) {
        super(name, id);
        this.payPerProduct = payPerProduct;
        this.processedProduct = processedProduct;
    }

    public double getPayPerProduct() {
        return payPerProduct;
    }

    public void setPayPerProduct(double payPerProduct) {
        this.payPerProduct = payPerProduct;
    }

    public int getProcessedProduct() {
        return processedProduct;
    }

    public void setProcessedProduct(int processedProduct) {
        this.processedProduct = processedProduct;
    }

    @Override
    public String toString() {
        return super.toString() +
                "payPerProduct=" + payPerProduct +
                ", processedProduct=" + processedProduct +
                '}';
    }
}
