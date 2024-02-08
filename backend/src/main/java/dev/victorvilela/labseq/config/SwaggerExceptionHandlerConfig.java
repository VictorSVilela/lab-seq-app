package dev.victorvilela.labseq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerExceptionHandlerConfig {

    @Bean
    public Docket exceptionApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("exception-api")
                .select()
                .apis(RequestHandlerSelectors.basePackage("dev.victorvilela.labseq"))
                .paths(PathSelectors.any())
                .build();
    }
}

