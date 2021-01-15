package customer.api.web;

import common.framework.redis.RedisAsyncUtil;
import common.framework.redis.RedisReactiveUtil;
import common.framework.redis.RedisSyncUtil;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.SetArgs;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.regex.Pattern;

/**
 * <p>Description: </p>
 *
 * @author linan
 * @date 2021-01-12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisSyncUtil redisSyncUtil;

    @Autowired
    private RedisAsyncUtil redisAsyncUtil;

    @Autowired
    private RedisReactiveUtil redisReactiveUtil;


    @Test
    public void TestRedis1(){
        RedisURI redisUri = RedisURI.builder()                                                                  // <1> 创建单机连接的连接信息
                .withHost("localhost")
                .withPort(6379)
                .withTimeout(Duration.ZERO)
                .build();
        RedisClient redisClient = RedisClient.create(redisUri);
        StatefulRedisConnection<String, String> connection = redisClient.connect();     // <3> 创建线程安全的连接
        RedisCommands<String, String> redisCommands = connection.sync();             // <4> 创建同步命令
//        SetArgs setArgs = SetArgs.Builder.nx().ex(5);
        redisCommands.set("name", "throwable");
        String result = redisCommands.get("name");
        List<String> a = redisCommands.keys("[a-z]*");

        Assertions.assertThat(result).isEqualTo("throwable");
    }

    @Test
    public void TestRedis2() throws InterruptedException {
        redisSyncUtil.set("redisSyncUtil1","hello world!");
        redisSyncUtil.set("redisSyncUtil2","bb hello world!",10);
        List a =redisSyncUtil.getKeyList("[a-z,1-9,A-Z]*");
        redisSyncUtil.expire("redisSyncUtil2",20000000);
        Thread.sleep(1000*11);
        System.out.println(redisSyncUtil.get("redisSyncUtil1"));
        System.out.println(redisSyncUtil.get("redisSyncUtil2"));
    }

    @Test
    public void TestRedis3(){
        redisSyncUtil.delete("redisSyncUtil1","redisSyncUtil2");
    }

    @Test
    public void TestRedis4() throws InterruptedException {
        redisAsyncUtil.set("redisAsyncUtil1","hello world!");
        redisAsyncUtil.set("redisAsyncUtil2","bb hello world!",10);
        redisAsyncUtil.expire("redisAsyncUtil2",20000000);
        Thread.sleep(1000*11);
        System.out.println(redisAsyncUtil.get("redisAsyncUtil1"));
        System.out.println(redisAsyncUtil.get("redisAsyncUtil2"));
    }
}
