package service;

import bean.Entity;
import bean.Product;


import java.util.HashSet;
import java.util.Set;

public class ProductRepository extends AbstractRepository {
    private Set<Product> products = new HashSet<>();

    @Override
    public void add(Entity entity) {
        products.add(entity)
    }

    @Override
    public Entity getById() {
        return null;
    }

    @Override
    public Set getListOfAllProducts() {
        return null;
    }

    @Override
    public void removeById() {

    }
}
