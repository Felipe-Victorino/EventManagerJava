package dao;

import java.util.List;

public interface InterfaceDao<T> {

    public void insert(T t);
    public void delete(T t);
    public void update(T t);
    public T searchBy(long id);
    public List<T> searchAll();

}