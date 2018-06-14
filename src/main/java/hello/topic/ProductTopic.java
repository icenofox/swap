package hello.topic;

import hello.Model.ProductList;
import hello.topic.subscription.Subscription;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import static hello.Model.ProductConstant.*;

@Component
public class ProductTopic {

    private Map<Integer, ConcurrentLinkedQueue<Subscription<ProductList>>> subMaps = new ConcurrentHashMap();

    @PostConstruct
    public void init() {
        subMaps.put(PRODUCT_TYPE_IRS, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_OIS, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_BASIS_SWAP, new ConcurrentLinkedQueue<>());
    }

    public DeferredResult<ProductList> subscribe(int productTypeId) {

        Subscription subscription = new Subscription<>(productTypeId);

        subMaps.get(productTypeId).offer(subscription);

        return subscription.getResult();

    }

}
