package customer.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author linan
 * @date 2020-07-27 14:52
 */
@SpringBootApplication
@EnableEurekaClient
public class WebSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootApplication.class,args);
    }
}
