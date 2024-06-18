package service;

import dto_dataTransferObject.StudentDTO;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService implements IService<Student> {
    private List<Student> list = StudentDTO.readFile(); // list in Java = 0 => 2
    @Override
    public void add(Student student) {
        list.add(student); // list in Java => 2 + 1 = 3
        // list in File = 2
        StudentDTO.writeFile(list);
    }
    @Override
    public void edit(int index, Student student) {
        list.set(index, student);
        StudentDTO.writeFile(list);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        if (index == -1) System.out.println("---There is no student in the list");
        else {
            list.remove(index);
            StudentDTO.writeFile(list);
            System.out.println("---Delete success");
        }
    }

    @Override
    public void searchByID(int id) {
        int index = findById(id);
        if (index == -1) System.out.println("---There is no student in the list");
        else System.out.println(list.get(index));
    }

    @Override
    public void searchByName(String name) {
        boolean checkOn = false;
        for (Student student: list){
            if (student.getName().contains(name)) {
                System.out.println(student);
                checkOn = true;
            }
        }if (!checkOn) System.out.println("---There is no student in the list");
    }

    @Override
    public void maxScore() {
        System.out.println("--------Show students of max score--------");
        List<Student> tempList = new ArrayList<>();
        tempList.addAll(list);
        Collections.sort(tempList);
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).getScore() == tempList.get(0).getScore()){
                System.out.println(tempList.get(i));
            }else break;
        }
    }

    @Override
    public List<Student> findAll() {
        return list;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
