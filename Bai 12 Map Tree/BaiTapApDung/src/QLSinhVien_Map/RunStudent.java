package QLSinhVien_Map;

import java.util.Scanner;

public class RunStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean notExit = true;
        manager.displaydefault();
        while (notExit) {
            System.out.println("---------------------");
            System.out.println(">>>>> Quản lý học sinh <<<<<: ");
            System.out.println("0: Thoát");
            System.out.println("1: Hiển thị sản phẩm");
            System.out.println("2: Thêm sản phẩm mới");
            System.out.println("3: Sửa sản phẩm đã có");
            System.out.println("4: Xóa sản phẩm ");
            System.out.println("5: Tìm kiếm theo tên: ");
            System.out.println("6: Tìm kiếm theo ID: ");
            System.out.println("Mời bạn nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    notExit = false;
                    break;
                case 1:
                    manager.display();
                    break;
                case 2:
                    manager.addStudent();
                    break;
                case 3:
                    manager.editStudent();
                    break;
                case 4:
                    manager.deleteStudent();
                    break;
                case 5:
                    manager.searchName();
                    break;
                case 6:
                    manager.searchID();
                    break;
                default:
                    System.out.println("---------------------");
                    System.out.println("Bạn nhập sai cú pháp");
                    break;
            }
        }
    }
}
