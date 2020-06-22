package com.meituan.spring_xml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author:luobin03
 * @CreateTime:2020-06-22
 * @Descirption:controller
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    //@Value("valueName")
    public String lastName;
    public String firstName;
    public Boolean boss;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", boss=" + boss +
                '}';
    }
}