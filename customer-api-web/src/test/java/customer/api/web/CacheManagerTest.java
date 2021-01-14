package customer.api.web;

import common.framework.cache.LfuCache;
import common.framework.cache.LruCache;
import common.framework.cache.TimeCache;
import common.framework.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2021-01-12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CacheManagerTest {

    @Autowired
    private TimeCache timeCache;

    @Autowired
    private LfuCache lfuCache;

    @Autowired
    private LruCache lruCache;

    @Test
    public void toolA(){
        Date a = DateUtil.parse("1991-10-26","yyyy-MM-dd");
        assert (DateUtil.ageOfNow("1991-10-26") ==29);
    }


    @Test
    public void toolB() throws InterruptedException {
        timeCache.put("timeCache1","this is a time Cache without Time");
        timeCache.put("timeCache2","this is a time Cache with time",10000);
        lfuCache.put("cache1","LFUcache");
        lfuCache.put("cache2","LFUcache",100);
        Thread.sleep(100);
        System.out.println(timeCache.get("timeCache1"));
        System.out.println(timeCache.get("timeCache2"));
        System.out.println(lfuCache.get("cache1"));
        System.out.println(lfuCache.get("cache2"));
        Thread.sleep(5000);
        System.out.println(timeCache.get("timeCache1"));
        System.out.println(timeCache.get("timeCache2"));
        System.out.println(lfuCache.get("cache1"));
        System.out.println(lfuCache.get("cache2"));
    }

//
}
