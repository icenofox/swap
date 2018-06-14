package hello.controller;

import hello.Model.ProductList;
import hello.data.ProductRepository;
import hello.topic.ProductTopic;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class ProductController {

    @Autowired
    private ProductTopic productTopic;

    @Autowired
    private ProductRepository repository;

    private static final Log logger = LogFactory.getLog(ProductController.class);



    @RequestMapping("/product/snapshot")
    public ProductList snapshot(@RequestParam(value = "productTypeId") int productTypeId) {

        ProductList ret = new ProductList();
        ret.setProductTypeId(productTypeId);
        ret.setProducts(repository.getProducts(productTypeId));

        return ret;
    }

    @RequestMapping("/product/topic")
    public @ResponseBody
    DeferredResult<ProductList> topic(@RequestParam(value = "productTypeId") int productTypeId) {

        final DeferredResult<ProductList> result = productTopic.subscribe(productTypeId);

        logger.info("topic " + productTypeId);
        return result;
    }


}
