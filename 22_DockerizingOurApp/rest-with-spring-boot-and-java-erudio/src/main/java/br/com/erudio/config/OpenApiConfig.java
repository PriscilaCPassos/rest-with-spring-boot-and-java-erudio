package br.com.erudio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
     OpenAPI customOpenAPI() {
        return new OpenAPI()
        .info(new Info()
                .title("Restfull API With Java 19 and Spring Boot 3 ")
                .version("v1")
                .description("Description About API")
                .termsOfService("https://github.com/PriscilaCPassos/rest-with-spring-boot-and-java-erudio")
                .license(
                        new License()
                                .name("Apache 2.0")
                                 .url("https://github.com/PriscilaCPassos/rest-with-spring-boot-and-java-erudio")
                        )
               );
    }



}
