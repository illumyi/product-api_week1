package uk.ac.westminster.product_api_week1;

public class Address {

    // fields - attributes belonging to objects of Adress class
    private String street;
    private String city;
    private String postcode;

    // no-arg constructor - for when u want a new object with fields = null
    public Address() {}
    //constructor - for when u want to set the values to each field
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }
    // getters - for encapsulation and allowing for access of private fields from outside class
    public String getStreet() { return street; }
    public String getCity() { return city;}
    public String getPostcode() { return postcode;}
}
