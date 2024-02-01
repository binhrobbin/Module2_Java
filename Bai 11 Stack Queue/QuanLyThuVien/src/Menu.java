import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.displayDefault();
        Scanner scanner = new Scanner(System.in);
        boolean notExit = true;
        while (notExit){
            System.out.println("---------------------");
            System.out.println(">>>>> Menu Quản lý <<<<<: ");
            System.out.println("0: Thoát");
            System.out.println("1: Thêm mới tài liêu: Sách, báo, tạp chí");
            System.out.println("2: Xoá tài liệu theo mã tài liệu");
            System.out.println("3: Hiển thị tất cả thư viện");
            System.out.println("4: Hiển thị tất cả Sách");
            System.out.println("5: Hiển thị tất cả Báo");
            System.out.println("6: Hiển thị tất cả Tạp Chí");
            System.out.println("Mời bạn nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    notExit = false;
                    break;
                case 1:
                    quanLySach.addChoice();
                    break;
                case 2:
                    quanLySach.deleteDocument();
                    break;
                case 3:
                    quanLySach.displayAll();
                    break;
                case 4:
                    quanLySach.showBook();
                    break;
                case 5:
                    quanLySach.showNewsPaper();
                    break;
                case 6:
                    quanLySach.showMagazine();
                    break;
                default:
                    System.out.println("---------------------");
                    System.out.println("Bạn nhập sai cú pháp");
                    break;
            }
        }
    }
}
