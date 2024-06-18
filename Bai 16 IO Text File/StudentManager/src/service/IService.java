package service;

import java.util.List;

public interface IService<E> {
    void add(E e);
    void edit(int id, E e);
    void delete(int id);
    void searchByID(int id);
    void searchByName(String name);
    void maxScore();
    List<E> findAll();
    int findById(int id);
}
