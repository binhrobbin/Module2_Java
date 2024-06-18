import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static StudentManager manager = new StudentManager();

    public static void main(String[] args) {
        manager.add();
        boolean notExit = true;
        while (notExit) {
            System.out.println("\n----Quản lý sinh Viên----");
            System.out.println("0. Thoát");
            System.out.println("1. Thêm mới sv");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo ID");
            System.out.println("5. Hiển thị ds sv theo tên gần đúng");
            System.out.println("6. Học viên có điểm tb lớn nhất");
            System.out.println("7. Hiển thị tất cả");

            int choice =0;
            boolean errorOn = false ;
            do {
                try {
                    System.out.println("\n Mời bạn nhập lựa chọn: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    errorOn = false;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Bạn nhập sai kiểu dl");
                    errorOn = true;
                }
            }while (errorOn);

            switch (choice){
                case 0: notExit = false;
                    break;
                case 1: inputStudent(1,-1);
                    break;
                case 2: checkID(2);
                    break;
                case 3: checkID(3);
                    break;
                case 4: checkID(4);
                    break;
                case 5:
                    System.out.println("Nhập ký tự/ tên cần tìm: ");
                    String keySearch = scanner.nextLine();
                    manager.searchName(keySearch);
                    break;
                case 6: manager.showMaxDTB();
                    break;
                case 7: manager.displayAll();
                    break;
                default:
                    System.out.println("Bạn nhập sai cú pháp");
            }
        }
    }
    static void inputStudent(int choice, int index){
        System.out.println("Nhập tên: ");
        String newName = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String newGender = scanner.nextLine();
        boolean errorOn = false;
        double newToan = 0;
        double newVan = 0;
        double newAnh = 0;
        do {
            try {
                System.out.println("Nhập điểm Toán: ");
                newToan = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập điểm Văn: ");
                newVan = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập điểm Anh: ");
                newAnh = Double.parseDouble(scanner.nextLine());
                errorOn = false;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai kiểu dữ liệu điểm");
                errorOn = true;
            }
        }while (errorOn);
        if (choice == 1) {
            manager.addStudent(newName,newGender,newToan,newVan,newAnh);
        }else manager.editStudent(index,newName,newGender,newToan,newVan,newAnh);
    }
    static void checkID(int choice){
        boolean checkOn = false;
        int id=0;
        do {
            try {
                System.out.println("Nhập ID: ");
                id = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Nhập sai kiểu dữ liệu id");
                continue;
            }
            for (int i = 0; i < StudentManager.list.size(); i++) {
                if (StudentManager.list.get(i).getId() == id) {
                    if (choice == 2) manager.deleteStudent(i);
                    else if (choice == 3) inputStudent(3, i);
                    else System.out.println("Sinh viên: Id: " +manager.list.get(i));
                    checkOn = true;
                    break;
                }
            }
            if (!checkOn) System.out.println("Không có ID trong danh sách");
        }while (!checkOn);
    }
}
