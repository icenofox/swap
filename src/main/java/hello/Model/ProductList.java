package hello.Model;

import java.io.Serializable;
import java.util.List;

public class ProductList implements Serializable {
    private static final int serialVersionUID = 1;
    private int productTypeId;
    private List<Product> products;

    public ProductList(int productTypeId, List<Product> products) {
        this.products = products;
        this.productTypeId = productTypeId;
    }

    public ProductList() {

    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
