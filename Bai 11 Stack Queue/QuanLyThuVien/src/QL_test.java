import java.util.Scanner;

public class QL_test {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.displayDefault();
        Scanner scanner = new Scanner(System.in);
        boolean notExit = true;
        while (notExit){
            System.out.println("---------------------");
            System.out.println(">>>>> Quản lý Thư Viện <<<<<: ");
            System.out.println("0: Thoát");
            System.out.println("1: Thêm mới tài liêu: Sách, tạp chí, báo");
            System.out.println("2: Xoá tài liệu theo mã tài liệu");
            System.out.println("3: Hiện thị thông tin về tài liệu");
            System.out.println("4: Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo");
            System.out.println("5: Hiển thị tất cả");
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
                    quanLySach.displayOne();
                    break;
                case 4:
                    quanLySach.searchChoice();
                    break;
                case 5:
                    quanLySach.displayAll();
                    break;
                default:
                    System.out.println("---------------------");
                    System.out.println("Bạn nhập sai cú pháp");
                    break;
            }
        }
    }
}
