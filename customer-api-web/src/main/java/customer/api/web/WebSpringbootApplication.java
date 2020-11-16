package customer.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author linan
 * @date 2020-07-27 14:52
 */
@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class WebSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringbootApplication.class,args);
    }
}
