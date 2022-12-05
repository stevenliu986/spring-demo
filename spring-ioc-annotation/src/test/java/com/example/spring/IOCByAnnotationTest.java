package com.example.spring;

import com.example.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: IOCByAnnotationTest
 * Package: com.example.spring
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 5/12/2022 - 11:26 am
 * @Version: v1.0
 */
public class IOCByAnnotationTest {

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-setup.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);
    }
}
