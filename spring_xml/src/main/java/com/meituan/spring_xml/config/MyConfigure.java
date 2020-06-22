package com.meituan.spring_xml.config;

import com.meituan.spring_xml.SpringBean.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:luobin03
 * @CreateTime:2020-06-22
 * @Descirption:配置类
 */
@Configuration
public class MyConfigure {
    @Bean
    //helloBean默认组件方法名
    public HelloBean helloBean02() {
        System.out.println("配置类@Bean");
        return new HelloBean();
    }

}
