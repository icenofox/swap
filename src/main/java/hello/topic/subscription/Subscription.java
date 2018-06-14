package hello.topic.subscription;

import org.springframework.web.context.request.async.DeferredResult;

public class Subscription<T> {

    private int id;
    private DeferredResult<T> result = new DeferredResult();
    private long createTime;

    public Subscription(int id) {
        this.id = id;
        createTime = System.currentTimeMillis();
    }

    public DeferredResult<T> getResult() {
        return result;
    }

    public long getCreateTime(){
        return createTime;
    }


}
