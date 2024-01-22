import java.util.Arrays;
import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);
        static Product dienThoai1 = new Product("nokia",1000,3);
        static Product dienThoai2 = new Product("samsung",3000,3);
        static Product dienThoai3 = new Product("iphone",2000,3);
        static Product dienThoai4 = new Product("motorola",500,3);
        static  Product[] products = {dienThoai1,dienThoai2,dienThoai3,dienThoai4};

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lý sản phẩm: ");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm mới");
            System.out.println("3. Sửa sp hiện có");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Tìm kiếm sản phẩm theo tên");
            System.out.println("7. swap price");
            System.out.println("Mời bạn nhập tùy chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            display1();
            System.out.println("---------------------");
        }
        if (choice ==2){
        addProduct();
        }
        if (choice ==3){
                editProduct();
        }
        if (choice == 4){
            deleteProduct();
        }
        if (choice == 5){
            arrangePrice();
        }
        if (choice == 6){
            seachChar();
        }
            if (choice == 7){
                swap(dienThoai1,dienThoai2);
                System.out.println("ddt1 ="+dienThoai1.price);
                System.out.println("ddt2 ="+dienThoai2.price);
                System.out.println("-------------");
            }
        }
    }

    public static void swap(Product a,Product b){
        double temp = a.price;
        a.price = b.price;
        b.price = temp;
    }
    public static void display1() {
        for (Product p : products) {
            System.out.println(p.display());
        }
    }
    public static void addProduct() {
        System.out.println("Mời bạn nhập name sản phẩm mới: ");
        String ten = scanner.nextLine();
        System.out.println("Mời bạn nhập Price sản phẩm mới: ");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập Quantity sản phẩm mới: ");
        int sl = Integer.parseInt(scanner.nextLine());
        Product product = new Product(ten, gia, sl);
        Product[] productNew = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            productNew[i] = products[i];
        }
        productNew[productNew.length - 1] = product;
        products = productNew;
    }
    public static void editProduct() {
        System.out.println("Mời bạn nhập name sản phẩm muốn sửa: ");
        String ten = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
           if (products[i].name.equals(ten)) {
               System.out.println("Mời bạn nhập name sửa lại: ");
               String name = scanner.nextLine();
               System.out.println("Mời bạn nhập Price sửa lại: ");
               double price = Double.parseDouble(scanner.nextLine());
               System.out.println("Mời bạn nhập Quantity sửa lại: ");
               int quantity = Integer.parseInt(scanner.nextLine());
               products[i].name = name;
               products[i].price = price;
               products[i].quantity = quantity;
               System.out.println("Bạn đã sửa xong : ");
               display1();
               System.out.println("-------------------------------");
           }
        }
    }
    public static void deleteProduct() {
        System.out.println("Mời bạn nhập name sản phẩm muốn xóa: ");
        String ten = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equals(ten)) {
            Product[] newProduct = new Product[products.length-1];
                for (int j = 0; j < newProduct.length; j++) {
                    if (j<i) newProduct[j] = products[j];
                    else newProduct[j] = products[j+1];
                }
                products = newProduct;
                System.out.println("Bạn đã xóa: "+ten+" ra khỏi danh saách");
                display1();
                System.out.println("-------------------------------");
            }
        }
    }
    public static void arrangePrice(){
        int count;
        do {
            count = 0;
            for (int i = 0; i < products.length - 1; i++) {
                for (int j = i + 1; j < products.length; j++) {
                    if (products[i].price > products[j].price) {
                        Product product;
                        product = products[i];
                        products[i] = products[j];
                        products[j] = product;
                        count++;
                    }
                }
            }
        }
        while (count != 0);
        display1();
    }
    public static void seachName(){
        System.out.println("Mời bạn nhập tên cần tìm");
        String x = scanner.nextLine();
        System.out.println("Sản phẩm bạn cần tìm là: ");
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equals(x)){
                System.out.println(products[i].display());
            }
        }
        System.out.println("------------------ ");
    }
    public static void seachChar(){
        System.out.println("Mời bạn nhập tên/ký tự cần tìm");
        String x = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.contains(x)){
                System.out.println(products[i].display());
            }
        }
        System.out.println("------------------ ");
    }
}