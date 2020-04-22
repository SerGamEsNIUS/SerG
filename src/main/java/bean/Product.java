package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Product extends Entity {
    private BigDecimal price;

    private enum Category {
        BAKERY_PRODUCTS,
        FRUITS_AND_VEGETABLES,
        DAIRY_PRODUCTS,
        CONFECTIONERY,
        MEAT_AND_SAUSAGES,
        FISH_PRODUCTS,
        EGG_PRODUCTS,
        EDIBLE_FATS,
        SOFT_DRINKS,
        ALCOHOL,
        SMOKABLES
    }

    public Product() {
        super();
    }

    public Product(String name, BigDecimal price) {
        super(name);
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(id, product.id) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }


}
