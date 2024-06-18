package service;

import model.Employee;

import java.util.List;

public interface EService<E> {
    List<E> getAll();
    void add(E e);
    void edit(int index,int id,String name,int age,String mobileNumber,String address,String email,String type);
    void delete (int index);
    void searchName(String name);
    void findStatus(boolean status);
    void changeStatus(int index);
    void showTypeEmployee(String type);
    int findByID(int id);
    void addWorkDay();
    void calculateSalary(String type);
    void setAllWorkDay();
}
