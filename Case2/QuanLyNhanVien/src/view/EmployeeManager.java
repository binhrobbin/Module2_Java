package view;

import input.EmployeeValidator;
import input.Input;
import input.UserValidator;
import model.Employee;
import model.User;
import service.EmployeeService;
import service.UserService;

import java.util.List;

public class EmployeeManager {
    private static UserService userService = new UserService();
    private static EmployeeService employeeService = new EmployeeService();
    public void showEmployeeManager() {
        while (true){
            System.out.println("------------ Quản lý nhân viên ------------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa thông tin nhân viên");
            System.out.println("3. Xóa nhân viên và tài khoản");
            System.out.println("4. Tìm kiếm nhân viên theo tên");
            System.out.println("5. Hiển thị nhân viên full-time hoặc part-time");
            System.out.println("6. Hiển thị tất cả nhân viên");
            System.out.println("0. Trở lại");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    showFormAdd();
                    break;
                case 2:
                    showFormEdit();
                    break;
                case 3:
                    showFormDelete();
                    break;
                case 4:
                    showFindByName();
                    break;
                case 5:
                    showFormType();
                    break;
                case 6:
                    showAll();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("... Nhập sai lựa chọn");
            }
        }
    }
    public void showWorkdayManager() {
        while (true){
            System.out.println("------------ Quản lý ngày công ------------");
            System.out.println("1. Kiểm tra trạng thái đi làm của nhân viên trong ngày");
            System.out.println("2. Thay đổi trạng thái nhân viên");
            System.out.println("3. Điểm danh ngày ALL");
            System.out.println("4. Tính lương nhân viên");
            System.out.println("5. Đặt lại ngày công");
            System.out.println("6. Hiển thị nhân viên full-time hoặc part-time");
            System.out.println("7. Hiển thị tất cả nhân viên");
            System.out.println("0. Trở lại");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    showFormStatus();
                    break;
                case 2:
                    showChangeStatus();
                    break;
                case 3:
                    employeeService.addWorkDay();
                    break;
                case 4:
                    showCalculateSalary();
                    break;
                case 5:
                    employeeService.setAllWorkDay();
                    break;
                case 6:
                    showFormType();
                    break;
                case 7:
                    showAll();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("... Nhập sai lựa chọn");
            }
        }
    }
    public static String showType(){
        while (true) {
            System.out.println("1: full-time");
            System.out.println("2: part-time");
            int choice = Input.number();
            if (choice == 1) return "full-time";
            else if (choice == 2) return "part-time";
            else System.out.println("... Nhập sai lựa chọn");
        }
    }
    public static boolean showStatus(){
        while (true) {
            System.out.println("1: Có mặt: True");
            System.out.println("2: Vắng mặt: False");
            int choice = Input.number();
            if (choice == 1) return true;
            else if (choice == 2) return false;
            else System.out.println("... Nhập sai lựa chọn");
        }
    }
    public void showFormAdd(){
        System.out.println("----- Thêm nhân viên mới -----");
        int newId;
        System.out.print("Nhập ID nhân viên: ");
        while (true) {
            newId = EmployeeValidator.id();
            int id = userService.findByID(newId);
            if (id != -1) System.out.println("ID bị trùng, hãy nhập id khác: ");
            else break;
        }
        System.out.print("Nhập tên: ");
        String newName = EmployeeValidator.name();
        System.out.print("Nhập tuổi: ");
        int newAge = EmployeeValidator.age();
        System.out.print("Nhập số điện thoại: ");
        String newMobileNumber = EmployeeValidator.mobileNumber();
        System.out.print("Nhập địa chỉ: ");
        String newAddress = Input.string();
        System.out.print("Nhập email: ");
        String newEmail = EmployeeValidator.email();
        System.out.println("Chọn loại nhân viên: ");
        String newType = showType();

        String newUserName;
        do {
            System.out.print("\nNhập tên tài khoản: ");
            newUserName = UserValidator.account();
        }while (userService.checkUserName(newUserName));
        System.out.print("Nhập mật khẩu: ");
        String newPassword = Input.string();
        User newUser = new User(newId, newUserName,newPassword,"staff");
        userService.register(newUser);
        Employee employee = new Employee(newId,newName,newAge,newMobileNumber,newAddress,newEmail,newType,true,0,newUser);
        employeeService.add(employee);
    }
    public void showFormEdit(){
        System.out.println("----- Sửa thông tin nhân viên qua ID -----");
        System.out.println("Nhập ID nhân viên cần sửa: ");
        int id = EmployeeValidator.id();
        int index =  employeeService.findByID(id);
        if (index != -1){
            System.out.print("Nhập tên: ");
            String newName = EmployeeValidator.name();
            System.out.print("Nhập tuổi: ");
            int newAge = EmployeeValidator.age();
            System.out.print("Nhập số điện thoại: ");
            String newMobileNumber = EmployeeValidator.mobileNumber();
            System.out.print("Nhập địa chỉ: ");
            String newAddress = Input.string();
            System.out.print("Nhập email: ");
            String newEmail = EmployeeValidator.email();
            System.out.println("Chọn loại nhân viên: ");
            String newType = showType();
//            Employee employee = new Employee(id,newName,newAge,newMobileNumber,newAddress,newEmail,newType);
            employeeService.edit(index,id,newName,newAge,newMobileNumber,newAddress,newEmail,newType);
        }else System.out.println("... Không có id trong danh sách");
    }
    public void showFormDelete(){
        System.out.println("----- Xóa nhân viên -----");
        System.out.println("Nhập id cần xóa: ");
        int id = EmployeeValidator.id();
        int index =  employeeService.findByID(id);
        int index2 =  userService.findByID(id);
        if (index2 != -1) {
            userService.delete(index2);
            if (index != -1) employeeService.delete(index);
        } else System.out.println("... Không có id trong danh sách");

    }
    public void showFindByName(){
        System.out.println("----- Tìm kiếm theo ký tự/ tên -----");
        System.out.println("Nhập tên tương đối: ");
        String keyName = Input.string();
        employeeService.searchName(keyName);
    }
    public void showFormStatus(){
        System.out.println("----- Kiểm tra trạng thái nhân viên -----");
        System.out.println("Chọn loại trạng thái cần hiển thị: ");
        boolean status = showStatus();
        employeeService.findStatus(status);
    }
    public void showChangeStatus(){
        System.out.println("----- Thay đổi trạng thái nhân viên -----");
        System.out.println("Nhập id: ");
        int id = EmployeeValidator.id();
        int index =  employeeService.findByID(id);
        if (index != -1){
            employeeService.changeStatus(index);
        }else System.out.println("... Không có id trong danh sách");
    }

    public void showCalculateSalary(){
        System.out.println("----- Tính lương nhân viên -----");
        System.out.println("Chọn loại nhân viên: ");
        String type = showType();
        employeeService.calculateSalary(type);
    }
    public void showFormType(){
        System.out.println("----- Hiển thị nhân viên full-time hoặc part-time -----");
        System.out.println("Chọn loại nhân viên cần hiển thị: ");
        String type = showType();
        employeeService.showTypeEmployee(type);
    }
    public void showAll(){
        System.out.println("-----Hiển thị tất cả nhân viên-----");
        List<Employee> list = employeeService.getAll();
        System.out.println("id, tên, tuổi, sdt, địa chỉ, email, loại, trạng thái, số ngày công");
        for (Employee e: list){
            System.out.println(e);
        }
    }

}
