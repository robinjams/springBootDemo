package com.meituan.spring_xml;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringXmlApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void hasBean() {
        boolean is = ioc.containsBean("helloBean02");
        System.out.println(is);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
