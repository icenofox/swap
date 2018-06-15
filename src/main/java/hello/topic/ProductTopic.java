package hello.topic;

import hello.Model.Product;
import hello.Model.ProductList;
import hello.topic.subscription.Subscription;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import static hello.Model.ProductConstant.*;

@Component
public class ProductTopic {

    private Map<Integer, ConcurrentLinkedQueue<Subscription<ProductList>>> subMaps = new ConcurrentHashMap();

    private static final Log logger = LogFactory.getLog(ProductTopic.class);

    @PostConstruct
    public void init() {
        subMaps.put(PRODUCT_TYPE_IRS, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_OIS, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_BASIS_SWAP, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_AUD_OIS, new ConcurrentLinkedQueue<>());
        subMaps.put(PRODUCT_TYPE_BILLSLIBOR, new ConcurrentLinkedQueue<>());

    }

    public DeferredResult<ProductList> subscribe(int productTypeId) {

        Subscription subscription = new Subscription<>(productTypeId);

        subMaps.get(productTypeId).offer(subscription);

        return subscription.getResult();

    }

    public void onUpdate(long time, int productTypeId, List<Product> updates) {

        ConcurrentLinkedQueue<Subscription<ProductList>> queue = subMaps.get(productTypeId);
        if (queue == null || queue.size() == 0) {
            return;
        }

        queue.stream().forEach(sub -> {
            if (!sub.getResult().isSetOrExpired()) {
                long time1 = System.currentTimeMillis();
                sub.getResult().setResult(new ProductList(productTypeId, updates));
                long time2 = System.currentTimeMillis();
                logger.info(String.format("onUpdate set result total time = %d %d", time2 - time, time2 - sub.getCreateTime()));
            }
        });

        queue.clear();
    }

}
