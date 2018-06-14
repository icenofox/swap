package hello.data;

import hello.Model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static hello.Model.ProductConstant.*;

@Component
public class ProductRepository {

    private Map<Integer, Map<Integer, Product>> data = new ConcurrentHashMap();
    private int irsBegin = 1;
    private int irsEnd = irsBegin;

    private int oisBegin = 100;

    private int oisEnd = oisBegin;

    private ConcurrentHashMap buildIRS() {
        ConcurrentHashMap ret = new ConcurrentHashMap();


        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "1Y/1Y Fwd"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "6M q/q"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "1Y q/q"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "2Y q/q"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "3Y q/q"));

        return ret;
    }

    private ConcurrentHashMap buildOIS() {
        ConcurrentHashMap ret = new ConcurrentHashMap();


        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "1mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "2mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "3mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "4mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "5mOIS"));

        return ret;
    }

    @PostConstruct
    public void init() {

        data.put(PRODUCT_TYPE_IRS, buildIRS());
        data.put(PRODUCT_TYPE_OIS, buildOIS());
        data.put(PRODUCT_TYPE_BASIS_SWAP, new ConcurrentHashMap<>());
    }

    public List<Product> getProducts(int productTypeId) {
        Map products = data.get(productTypeId);
        if (products == null || products.size() == 0){
            return null;
        }

        return (List<Product>)products.values().stream().collect(Collectors.toList());

    }

    public Product getProduct(int productTypeId, int productId){
        return data.get(productTypeId).get(productId);
    }

    public int getIrsBegin() {
        return irsBegin;
    }

    public int getIrsEnd() {
        return irsEnd;
    }

    public int getOisBegin() {
        return oisBegin;
    }

    public int getOisEnd() {
        return oisEnd;
    }

}
