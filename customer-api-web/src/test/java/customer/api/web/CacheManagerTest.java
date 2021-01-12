package customer.api.web;

import common.framework.util.DateUtil;
import customer.api.web.cache.Cache;
import customer.api.web.cache.CacheByTime;
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
    private CacheByTime cacheByTime;

    @Autowired
    private Cache cache;

    @Test
    public void toolA(){
        Date a = DateUtil.parse("1991-10-26","yyyy-MM-dd");
        assert (DateUtil.ageOfNow("1991-10-26") ==29);
    }


    @Test
    public void toolB() throws InterruptedException {
        cacheByTime.put("timeCache1","this is a time Cache without Time");
        cacheByTime.put("timeCache2","this is a time Cache with time",20000);
        cache.put("cache","LFUcache",1000);

        Thread.sleep(100);
        System.out.println(cacheByTime.get("timeCache1"));
        System.out.println(cacheByTime.get("timeCache2"));
        System.out.println(cache.get("cache"));
        Thread.sleep(10000);
        System.out.println(cacheByTime.get("timeCache1"));
        System.out.println(cacheByTime.get("timeCache2"));
        System.out.println(cache.get("cache"));
    }

//
}
