package service;

import dto.ProductDTO;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService implements IService<Product> {
    private List<Product> list = ProductDTO.readFile();
    @Override
    public void add(Product product) {
    list.add(product);
    Collections.sort(list);
        ProductDTO.writeFile(list);
        System.out.println("... Add success");
    }

    @Override
    public void edit(int index, Product product) {
        list.set(index,product);
        ProductDTO.writeFile(list);
        System.out.println("... Edit success");
    }

    @Override
    public void delete(int index) {
        if (index != -1) {
            list.remove(index);
            ProductDTO.writeFile(list);
            System.out.println("... Delete success");
        }else System.out.println("... There is no ID in the list");
    }

    @Override
    public List<Product> getAll() {
        ProductDTO.readFile();
        return list;
    }

    @Override
    public void searchByName(String keyName) {
        boolean checkOn = false;
        for (Product product:list){
            if (product.getName().contains(keyName)) {
                System.out.println(product);
                checkOn = true;
            }
        }
        if (!checkOn) System.out.println("... There is no NAME containing in the list");
    }

    @Override
    public void searchByType(String type) {
        boolean checkOn = false;
        for (Product product:list){
            if (product.getType().equals(type)){
                System.out.println(product);
                checkOn = true;
            }
        }
        if (!checkOn) System.out.println("... There is no TYPE of product in the list");
    }

    @Override
    public void searchByID(int index) {
        if (index != -1) System.out.println(list.get(index));
        else System.out.println("... There is no ID in the list");
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
