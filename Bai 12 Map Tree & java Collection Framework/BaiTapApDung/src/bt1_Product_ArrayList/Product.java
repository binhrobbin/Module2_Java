package bt1_Product_ArrayList;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;
    static int count = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
        this.id = count;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() > o.getPrice()) return 1;
        else if (this.getPrice() < o.getPrice()) return -1;
        else return 0;
    }
}
