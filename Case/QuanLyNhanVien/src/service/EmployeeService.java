package service;

import dto.EmployeeDTO;
import dto.UserDTO;
import input.Input;
import model.Employee;
import model.User;

import java.util.Collections;
import java.util.List;

public class EmployeeService implements EService<Employee>{
    private static boolean check = false;
    private List<Employee> employeeList = EmployeeDTO.readFile();

    @Override
    public List<Employee> getAll() {
        EmployeeDTO.readFile();
        Collections.sort(employeeList);
        EmployeeDTO.writeFile(employeeList);
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        EmployeeDTO.writeFile(employeeList);
        System.out.println("... Thêm nhân viên thành công");
    }

    @Override
    public void edit(int index,int id,String name,int age,String mobileNumber,String address,String email,String type) {
        employeeList.get(index).setId(id);
        employeeList.get(index).setName(name);
        employeeList.get(index).setAge(age);
        employeeList.get(index).setMobileNumber(mobileNumber);
        employeeList.get(index).setAddress(address);
        employeeList.get(index).setEmail(email);
        employeeList.get(index).setType(type);
        EmployeeDTO.writeFile(employeeList);
        System.out.println("... Cập nhật nhân viên thành công");
    }

    @Override
    public void delete(int index) {
        employeeList.remove(index);
        EmployeeDTO.writeFile(employeeList);
        System.out.println("... Xóa nhân viên thành công");
    }

    @Override
    public void searchName(String name) {
        System.out.println("Danh sách nhân viên cần tìm là: ");
        boolean checkOn = false;
        for (Employee e:employeeList){
          if (e.getName().contains(name)){
              System.out.println(e);
              checkOn = true;
          }
        }if (!checkOn) System.out.println("Không có nhân viên nào phù hợp");
    }

    @Override
    public void findStatus(boolean status) {
        System.out.println("id, tên, loại nhân viên, trạng thái");
        boolean checkOn = false;
        for (Employee e:employeeList){
            if (e.isStatus() == status){
                System.out.println(e.getId()+", "+e.getName()+", "+e.getType()+", "+e.isStatus());
                checkOn = true;
            }
        }if (!checkOn) System.out.println("Không có nhân viên nào"+ status);
        else {
            System.out.println("Có mặt: (true) - Vắng mặt: (false)");
        }
    }

    @Override
    public void changeStatus(int index) {
        System.out.print("Nhân viên '"+employeeList.get(index).getName()+"' trạng thái: "+employeeList.get(index).isStatus());
        if (employeeList.get(index).isStatus()){
            employeeList.get(index).setStatus(false);
        }else employeeList.get(index).setStatus(true);
        EmployeeDTO.writeFile(employeeList);
        System.out.println(" --> "+employeeList.get(index).isStatus());
    }

    @Override
    public void showTypeEmployee(String type) {
        for (Employee e:employeeList){
            if (e.getType().equals(type)) System.out.println(e);
            }
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void addWorkDay(){
        if (!check) {
            System.out.println("... Điểm danh thành công");
            for (Employee e : employeeList) {
                if (e.isStatus()) e.setWorkday(e.getWorkday() + 1);
            }
            EmployeeDTO.writeFile(employeeList);
            check = true;
        }else System.out.println("... Bạn đã điểm danh hôm nay rồi");
    }
    @Override
    public void calculateSalary(String type) {
        System.out.println("Lương của nhân viên "+type+" là:");
        System.out.println("id, tên, số ngày công, lương");
        for (Employee e:employeeList){
            if (e.getType().equals(type)){
                if (type == "full-time"){
                    System.out.println(e.getId()+", "+e.getName()+", "+e.getWorkday()+", "+500000*e.getWorkday());
                }else {
                    System.out.println(e.getId()+", "+e.getName()+", "+e.getWorkday()+", "+200000*e.getWorkday());
                }
            }
        }
    }
    @Override
    public void setAllWorkDay() {
        System.out.println("Bạn có chắc chắn muốn đặt lại không?");
        System.out.println("1: Có");
        System.out.println("2: Không");
        int number = Input.sure();
        if (number == 1) {
            System.out.println("... Đặt lại thành công");
            for (Employee e : employeeList) {
                e.setWorkday(0);
            }
            EmployeeDTO.writeFile(employeeList);
        }else System.out.println("... Không đặt lại ngày công");
    }
}
