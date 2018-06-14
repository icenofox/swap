package hello.topic.subscription;

import org.springframework.web.context.request.async.DeferredResult;

public class Subscription<T> {

    private int id;
    private DeferredResult<T> result = new DeferredResult();

    public Subscription(int id) {
        this.id = id;
    }

    public DeferredResult<T> getResult() {
        return result;
    }


}
