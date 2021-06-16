package customer.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author linan
 * @date 2020-07-27 14:52
 */
//@SpringBootApplication(scanBasePackages = {"customer.api","common.framework.cache","common.framework.redis"})

@SpringBootApplication(scanBasePackages = {"customer.api","common.framework.*"})
@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "customer.api")
public class WebSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootApplication.class,args);
    }



}
