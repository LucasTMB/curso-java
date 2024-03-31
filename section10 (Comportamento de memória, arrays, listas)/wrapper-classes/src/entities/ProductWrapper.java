package entities;

public class ProductWrapper {
    public String name;
    public Double price;
    public Integer quantity;

    public ProductWrapper(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
