package com.xyh;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInt())
                .addPathPatterns("/**")
                .excludePathPatterns("/test")
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .excludePathPatterns("/tofile")
                .excludePathPatterns("/upload2")
                .excludePathPatterns("/fileupload")
                .excludePathPatterns("/gooutlogin")
                .excludePathPatterns("/adduser");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("tofile").setViewName("file");
    }
}
