package bt1_Product_ArrayList;

import java.util.Scanner;

public class TestProduct {
    static Scanner scanner = new Scanner(System.in);
    static ProductManager product = new ProductManager();
    public static void main(String[] args) {

        product.add();
        boolean notExit = true;
        while (notExit){
            System.out.println("\n ----------Menu---------");
            System.out.println("0. Exit");
            System.out.println("1. Hiển thị tất cả sp");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm theo ký tự/ tên");
            System.out.println("6. Sắp xếp tăng đần");
            System.out.println("7. Sắp xếp giảm đần");

            System.out.println("\n   Nhập lưạ chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0: notExit =false;
                    break;
                case 1: product.display();
                    break;
                case 2: inputNamePrice(2,0);
                    break;
                case 3: checkID(3);
                    break;
                case 4: checkID(4);
                    break;
                case 5:
                    System.out.println("Nhập ký tự/ tên cân tìm: ");
                    String newName = scanner.nextLine();
                    product.searchName(newName);
                    break;
                case 6: product.arrangementUp();
                    break;
                case 7: product.arrangementDown();
                    break;
                default:
                    System.out.println("nhập sai cú pháp rồi");
            }
        }

    }
    static void inputNamePrice(int choice,int id){
        System.out.println("Nhập tên mới: ");
        String newName = scanner.nextLine();
        System.out.println("Nhập giá mới: ");
        double newPrice = Double.parseDouble(scanner.nextLine());
        if (choice == 2){
            product.addProduct(newName,newPrice);
        }else product.editProduct(id,newName,newPrice);
    }
    static void checkID(int choice){
        boolean checkOff = true;
        do {
            System.out.println("Nhập ID cần tìm: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < ProductManager.arrayList.size(); i++) {
                if (ProductManager.arrayList.get(i).getId() == id) {
                    if (choice == 3) inputNamePrice(3, id);
                    else product.deleteProduct(id);
                    checkOff = false;
                    break;
                }
            }
            if (checkOff) System.out.println("ID không có trong danh sách sp");
        }while (checkOff);
    }
}
