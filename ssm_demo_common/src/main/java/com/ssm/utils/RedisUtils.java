package com.ssm.utils;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ouyangyufeng
 * @date 2019/5/20
 */
//@Component
public class RedisUtils<K, V> {

//    /**
//     * 缓存过期时间
//     */
//    private static final long TIMEOUT = 60;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//
//    /**
//     * 设置缓存
//     * @param keyName
//     * @param value
//     */
//    public void setKey(K keyName, V value){
//        redisTemplate.opsForValue().set(keyName, value);
//    }
//
//    /**
//     * 设置缓存
//     * @param keyName
//     * @param value
//     * @param timeout
//     */
//    public void setKey(K keyName, V value, long timeout){
//        redisTemplate.opsForValue().set(keyName, value, timeout, TimeUnit.SECONDS);
//    }
//
//    /**
//     * 获取缓存
//     * @param keyName
//     * @return
//     */
//    public Object getKey(K keyName){
//       return  redisTemplate.opsForValue().get(keyName);
//    }
//
//    /**
//     * 删除缓存
//     * @param keyName
//     */
//    public void deleteKey(K keyName){
//        redisTemplate.delete(keyName);
//    }
//
//    /**
//     * 判断缓存是否存在
//     * @param keyName
//     * @return
//     */
//    public boolean isHasKey(K keyName){
//        return redisTemplate.hasKey(keyName);
//    }

}
