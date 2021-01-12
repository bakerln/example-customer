package customer.api.web.cache;

import common.framework.cache.TimeCache;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2021-01-12
 */
@Component
public class CacheByTime extends TimeCache {

    public CacheByTime(){
        this(1000);
    }

    public CacheByTime(long timeout) {
        super(timeout);
    }

    public CacheByTime(long timeout, Map map) {
        super(timeout, map);
    }
}
