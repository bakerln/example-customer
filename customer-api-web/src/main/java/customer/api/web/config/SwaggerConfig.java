package customer.api.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>Description:  Swagger 配置</p>
 *
 * @author linan
 * @date 2020-11-26
 */
@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 选择那些路径和api会生成document
                .select()
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.basePackage("customer.api.web.controller"))
                .paths(PathSelectors.any())
//                .securitySchemes(asList(
//                        new OAuth(
//                            "petstore_auth",
//                            asList(new AuthorizationScope("write_pets", "modify pets in your account"),
//                                    new AuthorizationScope("read_pets", "read your pets")),
//                                Arrays.<GrantType>asList(new ImplicitGrant(new LoginEndpoint("http://petstore.swagger.io/api/oauth/dialog"), "tokenName"))
//                        ),
//                        new ApiKey("api_key", "api_key", "header")
//                ))
                //另一种筛选方式
//                .apis(RequestHandlerSelectors.any())
                //错误路径不监控
//                .paths(
//                        Predicates.and(ant("/**"),
//                        Predicates.not(ant("/error"))))
//                        Predicates.not(ant("/actuator/**"))))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Example")
                .description("WEB服务调用示例")
                .contact(new Contact("liNan", "http:/test-url.com", "linan.groot@outlook.com"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }
}
