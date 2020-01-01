package com.greenism.token.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:InterceprorConfig
 * Package:com.greenism.token.interceptor
 * Description
 *
 * @data:2020/1/1 20:21
 * @author:jiahongjie
 */
@Configuration
public class InterceptorConfigS implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( interceptor())
                .addPathPatterns("/**");
    }
    @Bean
    public Interceptor interceptor() {
        return new Interceptor();
    }
}
