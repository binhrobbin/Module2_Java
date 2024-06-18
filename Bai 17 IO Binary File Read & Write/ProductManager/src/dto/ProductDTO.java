package dto;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
    private static final File file = new File("data/product.csv");
    public static List<Product> readFile(){
        List<Product> productsInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),data[4]);
                productsInFile.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productsInFile;
    }
    public static void writeFile(List<Product> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Product p: listWriteFile){
                data += p.getId()+","+p.getName()+","+p.getQuantity()+","+p.getPrice()+","+p.getType()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
