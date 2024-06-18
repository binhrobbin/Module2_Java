package service;

import java.util.List;

public interface IService <E>{
    void add (E e);
    void edit (int index, E e);
    void delete(int index);
    List<E> getAll();
    void searchByName(String keyName);
    void searchByType(String type);
    void searchByID(int index);
    int findByID(int id);
}
