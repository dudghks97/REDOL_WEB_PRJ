package com.test.redol.config;

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
        // 2번째 라인 : 1번에 해당하는 요청을 처리할 자원을 찾을 위치(여기서는 정적파일위치)
        // 3번째 라인 : 요청에 대한 캐시 갱신 시간을 설정한 것
        registry.addResourceHandler("resources/**")
                .addResourceLocations("classpath:/templates/", "classpath:/static/")
                .setCacheControl(CacheControl.maxAge(30, TimeUnit.SECONDS));
    }
}