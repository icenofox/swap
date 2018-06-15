package hello.data;

import hello.Model.Product;
import hello.topic.ProductTopic;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static hello.Model.ProductConstant.*;

@Component
public class ProductUpdateGenerator {

    private static final Log logger = LogFactory.getLog(ProductUpdateGenerator.class);


    @Autowired
    private ProductTopic topic;

    @Autowired
    private ProductRepository repository;

    public static double randomMid() {
        return BigDecimal.valueOf(RandomUtils.nextDouble())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public static double randomDelta() {
        double number = RandomUtils.nextInt(200) - 100;

        return BigDecimal.valueOf(number / 100)
                .setScale(2)
                .doubleValue();
    }

    private List<Product> generate(int productTypeId, int startId, int endId) {

        int count = (RandomUtils.nextInt() + 1) % (endId - startId);

        new Random().ints(count, startId, endId + 1).boxed();


        return new Random()
                .ints(count, startId, endId)
                .boxed()
                .map(id -> {
                    Product product = repository.getProduct(productTypeId, id);
                    product.setMid(randomMid());

                    product.setDelta(randomDelta());

                    return product;
                })
                .collect(Collectors.toList());
    }

    private void generate() {

        long time = System.currentTimeMillis();
        if (RandomUtils.nextBoolean()) {

            topic.onUpdate(time, PRODUCT_TYPE_IRS, generate(PRODUCT_TYPE_IRS, repository.getIrsBegin(), repository.getIrsEnd()));
        } else {
            topic.onUpdate(time, PRODUCT_TYPE_IRS, null);
        }

        if (RandomUtils.nextBoolean()) {

            topic.onUpdate(time, PRODUCT_TYPE_OIS, generate(PRODUCT_TYPE_OIS, repository.getOisBegin(), repository.getOisEnd()));
        } else {
            topic.onUpdate(time, PRODUCT_TYPE_OIS, null);
        }

        if (RandomUtils.nextBoolean()) {

            topic.onUpdate(time, PRODUCT_TYPE_BASIS_SWAP, generate(PRODUCT_TYPE_BASIS_SWAP, repository.getBasisSwapBegin(), repository.getBasisSwapEnd()));
        } else {
            topic.onUpdate(time, PRODUCT_TYPE_BASIS_SWAP, null);
        }

        if (RandomUtils.nextBoolean()) {

            topic.onUpdate(time, PRODUCT_TYPE_AUD_OIS, generate(PRODUCT_TYPE_AUD_OIS, repository.getAudOisBegin(), repository.getAudOisEnd()));
        } else {
            topic.onUpdate(time, PRODUCT_TYPE_AUD_OIS, null);
        }

        if (RandomUtils.nextBoolean()) {

            topic.onUpdate(time, PRODUCT_TYPE_BILLSLIBOR, generate(PRODUCT_TYPE_BILLSLIBOR, repository.getBillBegin(), repository.getBillEnd()));
        } else {
            topic.onUpdate(time, PRODUCT_TYPE_BILLSLIBOR, null);
        }

    }

    @PostConstruct
    public void init() {
//        Executors.newSingleThreadExecutor().execute(() -> {
//            while (true) {
//                try {
//                    long start = System.currentTimeMillis();
//                    generate();
//                    long spend = System.currentTimeMillis() - start;
//                    if (spend > 500) {
//                        logger.error("generate too long " + spend);
//                    }
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }

}
