package model;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String type;

    public Product(int id, String name, int quantity, double price, String type) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Product {" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", quantity: " + quantity +
                ", price: " + price +
                ", type: '" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.id > o.id) return 1;
        else if (this.id < o.id) return -1;
        else return 0;
    }
}
