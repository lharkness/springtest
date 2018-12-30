package com.leeharkness.springtest;

import com.leeharkness.springtest.configuration.TestServiceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Get Spring involvement
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TestServiceConfig.class);

        // Retrieve our test service
        TestService testService = ctx.getBean(TestService.class);

        // And use it
        System.out.println(testService.doWork(42));

    }
}
