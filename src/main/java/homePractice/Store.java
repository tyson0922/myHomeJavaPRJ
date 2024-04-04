package homePractice;

public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
        System.out.println(productType);
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand= new Store("lemonade");

    }
}