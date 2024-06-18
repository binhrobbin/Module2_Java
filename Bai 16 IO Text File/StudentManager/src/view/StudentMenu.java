package view;

import input.Input;
import model.Student;
import service.StudentService;

import java.util.List;

public class StudentMenu {
    private StudentService studentService = new StudentService();
    public void showMainMenu(){
        int choice;
        do {
            System.out.println("----->>> Student Manager <<<-----");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Find student by id");
            System.out.println("5. Find by name containing");
            System.out.println("6. Show student max score");
            System.out.println("7. Show all student");
            System.out.println("0. Back");
            System.out.println("Enter your choice: ");
            choice = Input.getNumber();
            switch (choice){
                case 1: showFormAdd();
                    break;
                case 2: showFormEdit();
                    break;
                case 3: showFormDelete();
                    break;
                case 4: showFormSearchByID();
                    break;
                case 5: showFormSearchByName();
                    break;
                case 6: studentService.maxScore();
                    break;
                case 7: showAll();
                    break;
                case 0: return;
                default:
                    System.out.println("--- There is no number of your choice");
            }
        }while (choice != 0);
    }
    public void showAll(){
        System.out.println("--------Show all Student--------");
        List<Student> list = studentService.findAll();
        for (Student student:list){
            System.out.println(student);
        }
    }
    public void showFormAdd(){
        System.out.println("--------Add student-------");
        System.out.println("Enter ID: ");
        int id = Input.getNumber();
        System.out.println("Enter Name: ");
        String name = Input.getString();
        System.out.println("Enter Gender: ");
        String gender = Input.getString();
        System.out.println("Enter Score: ");
        double score = Input.getDoubleNumber();
        Student student = new Student(id,name,gender,score);
        studentService.add(student);
        System.out.println("---Add success");
    }
    public void showFormEdit(){
        System.out.println("--------Edit student-------");
        System.out.println("Enter id to edit: ");
        int id = Input.getNumber();
        int index = studentService.findById(id);
        if (index == -1) System.out.println("---There is no student in the list");
        else {
            System.out.println("Enter Name: ");
            String name = Input.getString();
            System.out.println("Enter Gender: ");
            String gender = Input.getString();
            System.out.println("Enter Score: ");
            double score = Input.getNumber();
            Student student = new Student(id,name,gender,score);
            studentService.edit(index,student);
            System.out.println("---Edit success");
        }
    }
    public void showFormDelete(){
        System.out.println("--------Delete student-------");
        System.out.println("Enter ID to delete: ");
        int id = Input.getNumber();
        studentService.delete(id);
    }
    public void showFormSearchByID(){
        System.out.println("--------SearchByID-------");
        System.out.println("Enter ID to search: ");
        int id = Input.getNumber();
        studentService.searchByID(id);
    }
    public void showFormSearchByName(){
        System.out.println("Enter name containing: ");
        String name = Input.getString();
        studentService.searchByName(name);
    }
}
