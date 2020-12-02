package customer.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author linan
 * @date 2020-07-27 14:52
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class WebSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootApplication.class,args);
    }
}
