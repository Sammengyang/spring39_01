package com.zmy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-02 10:01
 */
public class TestSpring {

    @Test
    public void test1(){
        // 读取xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // 调用getBean方法获取对象
            // id 作为参数
        Object person = context.getBean("person");

        Person person1 = context.getBean(Person.class);
    }
}
