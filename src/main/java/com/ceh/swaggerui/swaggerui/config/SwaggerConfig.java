package com.ceh.swaggerui.swaggerui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

 /**
   * @Author: enHui.Chen
   * @Description: 什么是swagger?swagger就是一款生成、描述、管理rest api的开源技术,它使用了最优雅的方式解决了诸多传统word记录接口的弊端。
  *                 例如接口信息无法实时更新以及接口无法在线测试。
   * @Data 2018/9/13
   */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ceh.swaggerui.swaggerui.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("swagger标题测试")
                .description("生成rest api文档最优雅的一款技术")
                .termsOfServiceUrl("https://github.com/")
                .version("v1.0")
                .build();
    }
}
