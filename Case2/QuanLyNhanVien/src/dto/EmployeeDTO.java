package dto;

import model.Employee;
import model.User;
import service.UserService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
    private static UserService userService = new UserService();
    private static final File file = new File("data/employee.csv");
    public static List<Employee> readFile(){
        List<Employee> employeesInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(", ");
                int id = Integer.parseInt(data[0]);
                String name =data[1];
                int age = Integer.parseInt(data[2]);
                String mobileNumber = data[3];
                String address = data[4];
                String email = data[5];
                String type = data[6];
                boolean status = Boolean.parseBoolean(data[7]);
                int workday = Integer.parseInt(data[8]);
                String username = userService.getUsernameByID(id);
                String pass = userService.getPassByID(id);
                String permission = userService.getPermissionByID(id);
                User user = new User(id,username,pass,permission);
                Employee employee = new Employee(id,name,age,mobileNumber,address,email,type,status,workday,user);
                employeesInFile.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("lỗi đọc file");
        }
        return employeesInFile;
    }
    public static void writeFile(List<Employee> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "id, tên, tuổi, sdt, địa chỉ, email, loại, trạng thái, số ngày công\n";
            for (Employee e: listWriteFile){
                data += e.getId()+", "+e.getName()+", "+e.getAge()+", "+e.getMobileNumber()+
                        ", "+e.getAddress()+", "+e.getEmail()+", "+e.getType()+", "+e.isStatus()+", "+e.getWorkday()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("lỗi ghi file");
        }
    }
}
