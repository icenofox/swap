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

    private int basisSwapBegin = 200;
    private int basisSwapEnd = basisSwapBegin;

    private int audOisBegin = 300;
    private int audOisEnd = audOisBegin;

    private int billBegin = 400;
    private int billEnd = billBegin;

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
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "4Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "4Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "5Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "6Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "7Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "8Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "9Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "10Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "12Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "15Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "20Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "25Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "30Y s/s"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "3M /1Y1"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "6M /1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "9M /1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "1Y/1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "1Y/2Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "3M/1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "18M/1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "2Y/1Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "2Y/2Y Q"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "2Y/2Y"));
        irsEnd++;
        ret.put(irsEnd, new Product(irsEnd, PRODUCT_TYPE_IRS, "5Y/5Y"));

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
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "6mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "9mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "12mOIS"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Jul-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Aug-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Sep-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Oct-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Nov-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Dec-18 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Feb-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Mar-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Apr-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA May-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Jun-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Jul-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Aug-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Sep-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Oct-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Nov-19 Meeting"));
        oisEnd++;
        ret.put(oisEnd, new Product(oisEnd, PRODUCT_TYPE_OIS, "RBA Dec-19 Meeting"));

        return ret;
    }

    private ConcurrentHashMap buildBasisSwap() {

        ConcurrentHashMap ret = new ConcurrentHashMap();


        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 3M"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 6M"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 9M"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 1Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 2Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 3Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 4Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 5Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 6Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 7Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 8Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 9Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "3Mv1M 10Y"));

        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 6M"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 1Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 2Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 3Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 4Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 5Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 6Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 7Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 8Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 9Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 10Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 12Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 15Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 20Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 25Y"));
        basisSwapEnd++;
        ret.put(basisSwapEnd, new Product(basisSwapEnd, PRODUCT_TYPE_BASIS_SWAP, "6Mv3M 30Y"));
        return ret;
    }

    private ConcurrentHashMap buildAudOis() {

        ConcurrentHashMap ret = new ConcurrentHashMap();


        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "1mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "2mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "3mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "4mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "5mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "6mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "9mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "12mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "15mOIS"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "30mOIS ann"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "36mOIS ann"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Jul-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Aug-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Sep-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Oct-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Nov-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Dec-18 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Feb-19 Meeting"));
        oisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Mar-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Apr-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA May-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Jun-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Jul-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Aug-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Sep-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Oct-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Nov-19 Meeting"));
        audOisEnd++;
        ret.put(audOisEnd, new Product(audOisEnd, PRODUCT_TYPE_AUD_OIS, "RBA Dec-19 Meeting"));

        return ret;
    }

    private ConcurrentHashMap buildBillsLibor() {

        ConcurrentHashMap ret = new ConcurrentHashMap();

        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "2Y1Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "6M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "9M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "1Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "3Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "2Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "4Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "5Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "6Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "7Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "8Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "9Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "10Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "12Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "15Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "20Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "25Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "30Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "1M3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "2M3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "3M3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "6M3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "6M6M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "9M3M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "1Y6M BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "1Y1Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "2Y1Y BILLSLIBOR"));
        billEnd++;
        ret.put(billEnd, new Product(billEnd, PRODUCT_TYPE_BILLSLIBOR, "5Y5Y BILLSLIBOR"));


        return ret;
    }

    @PostConstruct
    public void init() {

        data.put(PRODUCT_TYPE_IRS, buildIRS());
        data.put(PRODUCT_TYPE_OIS, buildOIS());
        data.put(PRODUCT_TYPE_BASIS_SWAP, buildBasisSwap());
        data.put(PRODUCT_TYPE_AUD_OIS, buildAudOis());
        data.put(PRODUCT_TYPE_BILLSLIBOR, buildBillsLibor());


    }

    public List<Product> getProducts(int productTypeId) {
        Map products = data.get(productTypeId);
        if (products == null || products.size() == 0) {
            return null;
        }

        return (List<Product>) products.values().stream().collect(Collectors.toList());

    }

    public Product getProduct(int productTypeId, int productId) {
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

    public int getBasisSwapBegin() {
        return basisSwapBegin;
    }

    public int getBasisSwapEnd() {
        return basisSwapEnd;
    }

    public int getAudOisBegin() {
        return audOisBegin;
    }

    public int getAudOisEnd() {
        return audOisEnd;
    }

    public int getBillBegin() {
        return billBegin;
    }

    public int getBillEnd() {
        return billEnd;
    }


}
