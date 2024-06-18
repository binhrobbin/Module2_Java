package view;

import input.Input;

public class RoomManager {
    public void showRoomManager() {
        while (true){
            System.out.println("----->>> Quản lý phòng <<<-----");
            System.out.println("1. Danh sách phòng hiện có");
            System.out.println("2. Tìm kiếm phòng theo giá");
            System.out.println("3. Kiểm tra phòng");
            System.out.println("4. Thêm phòng mới");
            System.out.println("5. Sửa phòng");
            System.out.println("0. Trở lại");
            int choice = Input.number();
            switch (choice) {
//                case 1:
//                    showFormAdd();
//                    break;
//                case 2:
//                    showFormEdit();
//                    break;
//                case 3:
//                    showFormDelete();
//                    break;
//                case 4:
//                    showFormSearchByID();
//                    break;
                case 5:
//                    showFormSearchByName();
                    break;
                case 0: return;
                default:
                    System.out.println("--- Nhập sai lựa chọn");
            }
        }
    }
}
