package service;

import bean.Entity;

import java.util.Set;

public abstract class AbstractRepository<T extends Entity> {
    public abstract void add(T t);
    public abstract T getById();
    public abstract Set getListOfAllProducts();
    public abstract void removeById();

}
