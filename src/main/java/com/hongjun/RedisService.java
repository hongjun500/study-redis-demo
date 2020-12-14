package com.hongjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Objects;

/**
 * @author hongjun500
 * @date 2020/12/14 17:09
 * @tool ThinkPadX1隐士
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Service
public class RedisService {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key) {
        redisTemplate.opsForValue().set(key,"data数据数据数据数据数据数据");
    }
    public Object getValue(String key) {
        Object o = redisTemplate.opsForValue().get(key);
        return o;
    }
}
