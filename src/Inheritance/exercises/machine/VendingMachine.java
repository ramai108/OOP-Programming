package Inheritance.exercises.machine;
public class VendingMachine {

    private Integer productsNumber;
    private Product [] products;
    private Double balance;

    private Double change;

    public VendingMachine (Integer productsNumber, Double balance) {
        this.productsNumber = productsNumber;
        this.balance = balance;
    }

    public VendingMachine () {
    }

    public void load(Product ... products) {
        this.products = products;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getCurrentBalance() {
        Double c =  0.0;
        for (Product item : products) {
            c += item.getPrice();
        }
        return c;
    }

    public Double getChange () {
        Double c =  0.0;
        for (Product item : products) {
            c += item.getPrice();
        }
        return getBalance() - c;
    }

    private String getProduct (Integer input) {
        for (Product item : products) {
            if (item.getId() == input)
                return item.getName().toString();
        }
        return null;
    }

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine(5,8.0);
        Product p1 = new WaterBottle(1,1.3,"Santana Water");
        Product p2 = new ChocolateBar(2,0.78,"Negrita C");
        Product p3 = new WaterBottle(3,1.5,"2L pure water");

        vm.load(p1,p2,p3);
        System.out.println(vm.getProduct(3));
        System.out.println(vm.getChange());
        System.out.println(vm.getCurrentBalance());
    }
}
