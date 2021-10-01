package com.test.demo.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        // 1번째 라인 : "/" 를 시작으로 하는 모든 요청을 다룬다는 의미
        // 2번째 라인 : 1번에 해당하는 요청을 처리할 자원을 찾을 위치(템플릿 위치)
        // 3번째 라인 : 요청에 대한 캐시를 10분으로 설정한 것
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/")
                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
    }
}