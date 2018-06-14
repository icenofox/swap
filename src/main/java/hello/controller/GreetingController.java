package hello.controller;

import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

import hello.Greeting;
import hello.topic.*;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import javax.annotation.PostConstruct;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final static Log logger = LogFactory.getLog(GreetingController.class);

    private final Queue<DeferredResult<Greeting>> responseBodyQueue = new ConcurrentLinkedQueue<>();

    @Autowired
    private ProductTopic productTopic;

    @PostConstruct
    public void init() {
        Executors.newSingleThreadExecutor().execute(() -> {
            while (true) {
                try {
                    processQueues();
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @RequestMapping("/greeting")
    public @ResponseBody
    DeferredResult<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        final DeferredResult<Greeting> result = new DeferredResult();


        responseBodyQueue.add(result);
        return result;

    }

    public void processQueues() {
        logger.info("processQueues");
        for (DeferredResult result : responseBodyQueue) {


            Greeting greeting = new Greeting(RandomUtils.nextInt(), RandomStringUtils.random(10));
            result.setResult(greeting);
            responseBodyQueue.remove(result);
        }
    }
}
