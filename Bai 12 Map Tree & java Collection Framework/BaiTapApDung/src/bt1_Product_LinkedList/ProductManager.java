package bt1_Product_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class ProductManager {
    Product product1 = new Product("Màn hình", 123);
    Product product2 = new Product("Bàn phím", 15);
    Product product3 = new Product("Chuột", 8);
    Product product4 = new Product("Laptop", 550);
    static LinkedList<Product> linkedList = new LinkedList();
    public void add(){
        linkedList.add(product1);
        linkedList.add(product2);
        linkedList.add(product3);
        linkedList.add(product4);
    }

    public void display(){
        for (Product lists:linkedList){
            System.out.println(lists);
        }
    }
    public void addProduct(String name, double price){
        Product product = new Product(name,price);
        linkedList.add(product);
        System.out.println("Bạn vừa thêm sản phẩm: "+product);
    }
    public void editProduct(int id,String name, double price){
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId() == id){
                System.out.println("Bạn đã sửa sản pham "+linkedList.get(i));
                linkedList.get(i).setName(name);
                linkedList.get(i).setPrice(price);
                System.out.println("thành: "+linkedList.get(i));
                break;
            }
        }
    }
    public void deleteProduct(int id){
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId() == id) {
                System.out.println("Bạn đã xóa sản phẩm "+linkedList.get(i));
                linkedList.remove(i);
                // load lại ID
                Product.count = 0;
                for (int j = 0; j < linkedList.size(); j++) {
                    Product.count++;
                    linkedList.get(i).setId(Product.count);
                }
                break;
            }
        }
    }
    public void searchName(String name){
        boolean checkOn = false;
        System.out.println("Tên/kí tự bạn cần tìm là: ");
            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).getName().contains(name)) {
                    System.out.println(linkedList.get(i));
                    checkOn = true;
                }
            }
            if (!checkOn) System.out.println("không có tên sản phẩm nào phù hợp: ");
    }
    public void arrangementUp(){
//        linkedList.sort(Product::compareTo);
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(linkedList,priceComparator);
        System.out.println("Sản phẩm sau khi xx giá tăng dần là: ");
        for (Product product: linkedList){
            System.out.println(product);
        }
    }
    public void arrangementDown(){
//        linkedList.sort(Product::compareTo);
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(linkedList,priceComparator);
        Collections.reverse(linkedList);
        System.out.println("Sản phẩm sau khi xx giá giảm dần là: ");
        for (Product product: linkedList){
            System.out.println(product);
        }
    }
}
