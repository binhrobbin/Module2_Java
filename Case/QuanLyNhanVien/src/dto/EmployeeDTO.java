package dto;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {
    private static final File file = new File("data/employee.csv");
    public static List<Employee> readFile(){
        List<Employee> employeesInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(", ");
                Employee employee = new Employee(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),(data[3]),data[4],data[5],data[6],Boolean.parseBoolean(data[7]),Integer.parseInt(data[8]));
                employeesInFile.add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("lỗi đọc");
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
