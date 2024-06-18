package dto_dataTransferObject;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDTO {
    private static final File file = new File("data/student.csv");

    public static List<Student> readFile(){
        List<Student> studentsInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
            String[] data = line.split(","); //[1,Binh,Nam,6.8] , [2,Hieu,Nam,9.9]
            Student student = new Student(Integer.parseInt(data[0]),data[1],data[2],Double.parseDouble(data[3]));
            studentsInFile.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentsInFile;
    }
    public static void writeFile (List<Student> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Student student: listWriteFile){
                data += student.getId()+","+student.getName()+","+student.getGender()+","+student.getScore()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
