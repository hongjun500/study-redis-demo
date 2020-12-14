package com.hongjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author hongjun500
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StudyRedisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyRedisDemoApplication.class, args);
    }

}
