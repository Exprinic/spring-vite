package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 配置无后缀访问
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.addViewController("/{path:^(?!api$|assets$|js$|css$|img$).*}/**")
                .setViewName("forward:/index.html");
    }
}