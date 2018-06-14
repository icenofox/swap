package hello.Model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final int serialVersionUID = 1;
    private String tenor;
    private int productId;
    private int productTypeId;
    private String mid;
    private String delta;

    public Product(int productId, int productTypeId, String tenor, String mid){
        this.productId = productId;
        this.productTypeId = productTypeId;
        this.mid = mid;
        this.tenor = tenor;
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }
}
