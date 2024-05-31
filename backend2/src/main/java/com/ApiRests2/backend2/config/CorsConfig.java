package com.ApiRests2.backend2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
        .allowedOrigins("http://127.0.0.1:5500", "https://petstore.swagger.io")// Escribir la url del front
        .allowedMethods("*")// Especificar los metodos del front a permitir
        .allowCredentials(true);
        
    }
}
