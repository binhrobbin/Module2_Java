package bt1_Product_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    Product product1 = new Product("Màn hình", 123);
    Product product2 = new Product("Bàn phím", 15);
    Product product3 = new Product("Chuột", 8);
    Product product4 = new Product("Laptop", 550);
    static ArrayList<Product> arrayList = new ArrayList();
    public void add(){
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);
    }

    public void display(){
        for (Product lists:arrayList){
            System.out.println(lists);
        }
    }
    public void addProduct(String name, double price){
        Product product = new Product(name,price);
        arrayList.add(product);
        System.out.println("Bạn vừa thêm sản phẩm: "+product);
    }
    public void editProduct(int id,String name, double price){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id){
                System.out.println("Bạn đã sửa sản pham "+arrayList.get(i));
                arrayList.get(i).setName(name);
                arrayList.get(i).setPrice(price);
                System.out.println("thành: "+arrayList.get(i));
                break;
            }
        }
    }
    public void deleteProduct(int id){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                System.out.println("Bạn đã xóa sản phẩm "+arrayList.get(i));
                arrayList.remove(i);
                // load lại ID
                Product.count = 0;
                for (int j = 0; j < arrayList.size(); j++) {
                    Product.count++;
                    arrayList.get(i).setId(Product.count);
                }
                break;
            }
        }
    }
    public void searchName(String name){
        boolean checkOn = false;
        System.out.println("Tên/kí tự bạn cần tìm là: ");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getName().contains(name)) {
                    System.out.println(arrayList.get(i));
                    checkOn = true;
                }
            }
            if (!checkOn) System.out.println("không có tên sản phẩm nào phù hợp: ");
    }
    public void arrangementUp(){
    arrayList.sort(Product::compareTo);
        System.out.println("Sản phẩm sau khi xx giá tăng dần là: ");
        for (Product product: arrayList){
            System.out.println(product);
        }
    }
    public void arrangementDown(){
        arrayList.sort(Product::compareTo);
        Collections.reverse(arrayList);
        System.out.println("Sản phẩm sau khi xx giá giảm dần là: ");
        for (Product product: arrayList){
            System.out.println(product);
        }
    }
}
