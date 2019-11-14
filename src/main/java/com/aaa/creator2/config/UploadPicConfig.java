package com.aaa.creator2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UploadPicConfig implements WebMvcConfigurer {
    @Override      //虚拟路径
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/upload/**").addResourceLocations("file:D:\\Hbuilder\\images\\");
    }
}
