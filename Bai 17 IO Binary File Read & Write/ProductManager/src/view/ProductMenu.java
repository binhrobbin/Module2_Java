package view;

import input.Input;
import model.Product;
import service.ProductService;
import service.UserService;

import java.util.List;

public class ProductMenu {
    static ProductService productService = new ProductService();
    public void showProductMenu(){
        int choice = -1;
        while (choice != 9){
            System.out.println("---->>> Product Manager <<<----");
            System.out.println("1. Add new product");
            System.out.println("2. Edit product by ID");
            System.out.println("3. Delete product by ID");
            System.out.println("4. Show all products");
            System.out.println("5. Find by name containing");
            System.out.println("6. Show TYPE of product");
            System.out.println("7. Find by id");
            System.out.println("8. Logout");
            System.out.println("9. Back");
            System.out.println("Enter your choice: ");
            choice = Input.inputChoiceNumber();
            switch (choice){
                case 1: showFormAdd();
                    break;
                case 2: showFormEdit();
                    break;
                case 3: showDeleteForm();
                    break;
                case 4: showAll();
                    break;
                case 5: showFindByName();
                    break;
                case 6: showTypeProduct();
                    break;
                case 7: showFindByID();
                    break;
                case 8:
                    UserService.staticUserIndex = -1;
                    return;
            }
        }
    }
    public void showAll(){
        System.out.println("-----Show all products-----");
        List<Product> list = productService.getAll();
        for (Product product: list){
            System.out.println(product);
        }
    }
    public void showFormAdd(){
        System.out.println("-----Add new product-----");
        int newId;
        System.out.println("Enter id: ");
        while (true) {
            newId = Input.inputNumber();
            int id = productService.findByID(newId);
            if (id != -1) System.out.println("ID already exists, please enter another ID: ");
            else break;
        }
        System.out.println("Enter name: ");
        String newName = Input.inputString();
        System.out.println("Enter quantity: ");
        int newQuantity = Input.inputNumber();
        System.out.println("Enter price: ");
        double newPrice = Input.inputDoubleNumber();
//        System.out.println("Enter type of product: ");
//        String newType = Input.inputString();
        String newType = TypeManager.showType();
        Product product = new Product(newId,newName,newQuantity,newPrice,newType);
        productService.add(product);
    }
    public void showFormEdit(){
        System.out.println("-----Edit product by ID-----");
        System.out.println("Enter id: ");
        int id = Input.inputNumber();
        int index =  productService.findByID(id);
        if (index != -1){
            System.out.println("Enter name: ");
            String newName = Input.inputString();
            System.out.println("Enter quantity: ");
            int newQuantity = Input.inputNumber();
            System.out.println("Enter price: ");
            double newPrice = Input.inputDoubleNumber();
//            System.out.println("Enter type of product: ");
//            String newType = Input.inputString();
            String newType = TypeManager.showType();
            Product product = new Product(id,newName,newQuantity,newPrice,newType);
            productService.edit(index,product);
        }else System.out.println("... There is no product in the list");
    }
    public void showDeleteForm(){
        System.out.println("-----Delete product by ID-----");
        System.out.println("Enter id: ");
        int id = Input.inputNumber();
        int index =  productService.findByID(id);
        productService.delete(index);
    }
    public void showFindByName(){
        System.out.println("-----Find by name containing-----");
        System.out.println("Enter name containing: ");
        String keyName = Input.inputString();
        productService.searchByName(keyName);
    }
    public void showTypeProduct(){
//        System.out.println("-----Show all product by type-----");
//        System.out.println("Enter type of product: ");
//        String type = Input.inputString();
        String type = TypeManager.showType();
        productService.searchByType(type);
    }
    public void showFindByID(){
        System.out.println("-----Find by id-----");
        System.out.println("Enter id: ");
        int id = Input.inputNumber();
        int index = productService.findByID(id);
        productService.searchByID(index);
    }
}
