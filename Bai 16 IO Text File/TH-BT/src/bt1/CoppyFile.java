package bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoppyFile {
    public List<String> readFile(String pathFile){
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ko tìm thấy file");
        }catch (IOException o){
            System.err.println("lỗi khi đọc file");
        }
        return list;
    }
    public void writeFile (List<String> list, String pathFileTarget) {
        File file = new File(pathFileTarget);
        if (file.exists()){
            throw new RuntimeException();
        }else {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (String line:list){
                data += line + "\n";
            }
            bufferedWriter.write(data);
                System.out.println("coppy thành công");
            bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        CoppyFile coppyFile = new CoppyFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file cần coppy: ");
        String path = "src/bt1/source.txt";
        List<String> list = new ArrayList<>();
        list = coppyFile.readFile(path);
        System.out.println("Nhập đường dẫn file target: ");
        String path2 = "src/bt1/target.txt";
        try {
            coppyFile.writeFile(list,path2);
        }
        catch (RuntimeException runtimeException){
            System.err.println("Lỗi trùng file");
        }
    }
}
