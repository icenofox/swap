package hello.Model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final int serialVersionUID = 1;
    private String tenor;
    private int productId;
    private int productTypeId;
    private Double mid;
    private Double delta;

    public Product(int productId, int productTypeId, String tenor){
        this.productId = productId;
        this.productTypeId = productTypeId;
        this.tenor = tenor;
    }

    public Product(int productId, int productTypeId, String tenor, Double mid, Double delta){
        this.productId = productId;
        this.productTypeId = productTypeId;
        this.mid = mid;
        this.tenor = tenor;
        this.delta = delta;
    }


    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }
}
