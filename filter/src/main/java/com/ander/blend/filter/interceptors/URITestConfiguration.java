package com.ander.blend.filter.interceptors;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration 含义 注册到 spring 管理
 * <mvc:interceptors>
 * <!-- 使用 bean 定义一个 Interceptor，直接定义在 mvc:interceptors 下面的 Interceptor 将拦截所有的请求 -->
 * <bean class="com.hit.interceptor.WrongCodeInterceptor"/>
 * <mvc:interceptor>
 * <mvc:mapping path="/demo/hello.do"/>
 * <!-- 定义在 mvc:interceptor 下面的 Interceptor，表示对特定的请求进行拦截 -->
 * <bean class="com.hit.interceptor.LoginInterceptor"/>
 * </mvc:interceptor>
 * </mvc:interceptors>
 * ---------------------
 * 多个过滤器 也写在这里
 */
@Configuration
public class URITestConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new URITestInterceptor()).addPathPatterns("/interceptor/**");
    }
}
