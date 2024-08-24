package com.churros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService<K, V> {
  @Autowired
  private RedisTemplate<K, V> redisTemplate;
  
  public V get(K key) {
    return redisTemplate.opsForValue().get(key);
  }

  public void set(K key, V value) {
    redisTemplate.opsForValue().set(key, value);
  }
}
