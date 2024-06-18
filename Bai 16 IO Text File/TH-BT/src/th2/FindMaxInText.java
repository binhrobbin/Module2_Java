package th2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxInText {
    public List<Integer> readFile(String filePath) throws IOException {
        List<Integer> list = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) !=null){
            list.add(Integer.parseInt(line));
        }bufferedReader.close();
        return list;
    }
    public void writeFile(String filePath, int max) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Đã ghi vào fiel result");
        bufferedWriter.write(Integer.toString( max));
        bufferedWriter.close();
    }
    public int findMaxInList(List<Integer> list){
        int max = list.get(0);
        for (Integer i:list){
            if (max<i){
                max = i;
            }
        }return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file số: ");
        String path = scanner.nextLine();
        FindMaxInText find = new FindMaxInText();
        try {
            List<Integer> list = find.readFile(path);
            int max = find.findMaxInList(list);
            find.writeFile("src/th2/result.txt",max);
        } catch (IOException e) {
            System.err.println("Lỗi ko tìm thấy file");
        }

    }

}
