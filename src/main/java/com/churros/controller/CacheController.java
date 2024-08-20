package com.churros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CacheController {
  @Autowired
  private RedisTemplate<String, String> redisTemplate;

  @GetMapping("/get_cache/{key}")
  public String getMethodName(@PathVariable String key) {
    return redisTemplate.opsForValue().get(key);
  }
}
