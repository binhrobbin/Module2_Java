public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name1,double price, int quantity){
        name =name1;
        this.price = price;
        this.quantity = quantity;
    }
    public String display(){
        return "Tên điện thoại: "+name+" Giá: "+price+" Số lượng: "+ quantity ;
    }
}
