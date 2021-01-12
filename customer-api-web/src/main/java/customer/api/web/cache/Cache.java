package customer.api.web.cache;

import common.framework.cache.LfuCache;
import org.springframework.stereotype.Component;

/**
 * <p>Description: 最少使用率缓存.</p>
 *
 * @author linan
 * @date 2021-01-12
 */
@Component
public class Cache extends LfuCache {

    public Cache(){
        this(0);
    }

    public Cache(int capacity) {
        super(capacity);
    }

    public Cache(int capacity, long timeout) {
        super(capacity, timeout);
    }
}
