import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ThuVien> arrayList = new ArrayList<>();
    ThuVien sach1 = new Sach("NXB Tổng Hợp", 1000, "Dale Carnegie", 357);
    ThuVien sach2 = new Sach("NXB Văn Học", 1000, "Paulo Coelho", 226);
    ThuVien sach3 = new Sach("NXB Trẻ", 1000, "Nguyễn Nhật Ánh", 309);
    ThuVien bao1 = new Bao("NXB Kim Đồng", 1000, 25);
    ThuVien bao2 = new Bao("NXB Lao Động", 1000, 12);
    ThuVien bao3 = new Bao("NXB Trẻ", 1000, 06);
    ThuVien tapchi1 = new TapChi("NXB Lao Động", 1000, 25, 12);
    ThuVien tapchi2 = new TapChi("NXB Tổng Hợp", 1000, 55, 06);
    ThuVien tapchi3 = new TapChi("NXB Kim Đồng", 1000, 34, 11);

    public void displayDefault(){
        arrayList.add(sach1);
        arrayList.add(sach2);
        arrayList.add(sach3);
        arrayList.add(bao1);
        arrayList.add(bao2);
        arrayList.add(bao3);
        arrayList.add(tapchi1);
        arrayList.add(tapchi2);
        arrayList.add(tapchi3);
    }
    public void addChoice(){
        System.out.println("1: Thêm mới Sách");
        System.out.println("2: Thêm mới Báo");
        System.out.println("3: Thêm mới Tạp Chí");
        System.out.println("Mời bạn nhập lựa chọn muốn thêm: ");
        int choice = Integer.parseInt( scanner.nextLine());
        switch (choice){
            case 1: addBook();
                break;
            case 2: addNewsPaper();
                break;
            case 3: addMagazine();
                break;
            default:
                System.out.println("Bạn nhập sai cú pháp");
        }
    }
    public void displayAll(){
        for (ThuVien array : arrayList){
            System.out.println(array);
        }
    }
    public void addBook(){
        System.out.println("Nhập tên NXB mới: ");
        String tenNXB = scanner.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        int soBPH =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập tên tác giả: ");
        String tenTG = scanner.nextLine();
        System.out.println("Nhập số trang: ");
        int pages =Integer.parseInt( scanner.nextLine());
        arrayList.add(new Sach(tenNXB,soBPH,tenTG,pages));
        System.out.println("Bạn vừa thêm SÁCH mới: ");
    }
    public void addNewsPaper(){
        System.out.println("Nhập tên NXB mới: ");
        String tenNXB = scanner.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        int soBPH =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập ngày phát hành: ");
        int day =Integer.parseInt( scanner.nextLine());
        arrayList.add(new Bao(tenNXB,soBPH,day));
        System.out.println("Bạn vừa thêm Báo mới: ");
    }
    public void addMagazine(){
        System.out.println("Nhập tên NXB mới: ");
        String tenNXB = scanner.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        int soBPH =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập số phát hành: ");
        int soPH =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập tháng phát hành: ");
        int month =Integer.parseInt( scanner.nextLine());
        arrayList.add(new TapChi(tenNXB,soBPH,soPH,month));
        System.out.println("Bạn vừa thêm Tạp chí mới: ");
    }
    public void deleteDocument(){
        System.out.println("Nhập mã Tài liệu muốn xóa: ");
        String maTL = scanner.nextLine();
        int count =0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).maTL.equals(maTL)){
                arrayList.remove(i);
                System.out.println("Bạn vừa xóa mã "+maTL+" ra khỏi danh sách");
                count++;
            }
        }
        if (count==0)System.out.println("Bạn nhập sai mã??");
    }
    public void displayOne(){
        System.out.println("Nhập mã Tài liệu muốn hiển thị: ");
        String maTL = scanner.nextLine();
        int count =0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).maTL.equals(maTL)){
                System.out.println("Tài liệu bạn cần tìm là: ");
                System.out.println( arrayList.get(i));
                count++;
            }
        }
        if (count==0)System.out.println("Bạn nhập sai mã??");
    }
    public void searchChoice(){
        System.out.println("1: Tìm Sách");
        System.out.println("2: Tìm Báo");
        System.out.println("3: Tìm Tạp Chí");
        System.out.println("Mời bạn nhập lựa chọn muốn tìm: ");
        int choice = Integer.parseInt( scanner.nextLine());
        switch (choice){
            case 1: searchBook();
                break;
            case 2: searchNewsPaper();
                break;
            case 3: searchMagazine();
                break;
            default:
                System.out.println("Bạn nhập sai cú pháp");
        }
    }
    public void searchBook(){
        System.out.println("Nhập ký tự / mã Tài liệu Sách muốn tìm: ");
        String x = scanner.nextLine();
        int count =0;
        System.out.println("Sách bạn đang tìm: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Sach){
                if (arrayList.get(i).maTL.contains(x)) {
                    System.out.println(arrayList.get(i));
                    count++;
                }
            }
        }
        if (count==0)System.out.println("Không có mã nào trùng khớp");
    }
    public void searchNewsPaper(){
        System.out.println("Nhập ký tự / mã Tài liệu tờ Báo muốn tìm: ");
        String x = scanner.nextLine();
        int count =0;
        System.out.println("Báo bạn đang tìm: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Bao){
                if (arrayList.get(i).maTL.contains(x)) {
                    System.out.println(arrayList.get(i));
                    count++;
                }
            }
        }
        if (count==0) System.out.println("Không có mã nào trùng khớp");
    }
    public void searchMagazine(){
        System.out.println("Nhập ký tự / mã Tài liệu tờ Báo muốn tìm: ");
        String x = scanner.nextLine();
        int count =0;
        System.out.println("Tạp Chí bạn đang tìm: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TapChi){
                if (arrayList.get(i).maTL.contains(x)) {
                    System.out.println(arrayList.get(i));
                    count++;
                }
            }
        }
        if (count==0) System.out.println("Không có mã nào trùng khớp");
    }
    public void showBook(){
        System.out.println("Tất cả Sách trong kho: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Sach) {
                System.out.println(arrayList.get(i));
            }
        }
    }
    public void showNewsPaper(){
        System.out.println("Tất cả Báo trong kho: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Bao) {
                System.out.println(arrayList.get(i));
            }
        }
    }
    public void showMagazine(){
        System.out.println("Tất cả Tạp Chí trong kho: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TapChi) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}




