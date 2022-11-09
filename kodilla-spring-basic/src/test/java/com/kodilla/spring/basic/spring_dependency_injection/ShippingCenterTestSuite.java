package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.NotificationService;
import com.kodilla.spring.basic.spring_dependency_injection.homework.ShippingCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




    @SpringBootTest
    public class ShippingCenterTestSuite{
        @Test
        public void shouldReturnIfSuccess() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
            NotificationService bean = context.getBean(NotificationService.class);
            String address = bean.success("Warszawa, Wiejska 4/6/8");
            Assertions.assertEquals("Package delivered to: Warszawa, Wiejska 4/6/8", address);
        }

        @Test
        public void shouldReturnIfFail() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
            NotificationService bean = context.getBean(NotificationService.class);
            String address = bean.fail("Warszawa, Wiejska 4/6/8");
            Assertions.assertEquals("Package not delivered to: Warszawa, Wiejska 4/6/8", address);
        }
    }

