import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean notExit = true;
        StudentManager.displaydefault();
        while (notExit) {
            int checkNumberOfChoice = 0;
            do {
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
                if (choice == 0) {
                    notExit = false;
                    checkNumberOfChoice++;
                }
                if (choice == 1) {
                    StudentManager.display();
                    checkNumberOfChoice++;
                }
                if (choice == 2) {
                    StudentManager.addStudent();
                    checkNumberOfChoice++;
                }
                if (choice == 3) {
                    StudentManager.editStudent();
                    checkNumberOfChoice++;
                }
                if (choice == 4) {
                    StudentManager.deleteStudent();
                    checkNumberOfChoice++;
                }
                if (choice == 5) {
                    StudentManager.searchName();
                    checkNumberOfChoice++;
                }
                if (choice == 6) {
                    StudentManager.searchID();
                    checkNumberOfChoice++;
                }
                if (checkNumberOfChoice == 0) {
                    System.out.println("---------------------");
                    System.out.println("Bạn nhập sai cú pháp");
                }
            }while (checkNumberOfChoice == 0);
        }
    }
}