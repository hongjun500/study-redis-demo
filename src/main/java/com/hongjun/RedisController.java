package com.hongjun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongjun500
 * @date 2020/12/14 17:19
 * @tool ThinkPadX1隐士
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@RestController
public class RedisController {
    Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private RedisService redisService;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello redis!";
    }

    @ResponseBody
    @RequestMapping(value = "/getData")
    public Object test() {
        redisService.setValue("data");
        Object data = redisService.getValue("data");
        logger.info("data数据{}",data);
        return data;
    }
}
