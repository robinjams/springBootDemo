package com.meituan.spring_xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class SpringXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringXmlApplication.class, args);
    }

}
