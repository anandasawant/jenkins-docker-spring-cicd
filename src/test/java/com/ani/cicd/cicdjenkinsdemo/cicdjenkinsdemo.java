package com.ani.cicd.cicdjenkinsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class cicdjenkinsdemo {

    @Autowired
    private SmsController controller;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(controller);
    }
}
