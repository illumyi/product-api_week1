package uk.ac.westminster.product_api_week1;

public class Product {

    // instance attributes - for every object
    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getters - allow for access of private fields within class, from outside of it
    public Long getId() {  return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
