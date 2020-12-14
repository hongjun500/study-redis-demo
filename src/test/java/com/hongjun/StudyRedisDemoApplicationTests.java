package com.hongjun;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyRedisDemoApplicationTests {

    @Autowired
    private RedisService redisService;
    @Test
    void contextLoads() {
        redisService.setValue("data");
        Object dada = redisService.getValue("dada");
        System.out.println(dada);
    }

}
