package com.churros.controller;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.churros.dto.SetDTO;
import com.churros.http.ApiResponse;
import com.churros.repository.UserRepository;
import com.churros.service.RedisService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CacheController {

  @Autowired
  private RedisService<String, String> redisService;

  @GetMapping("/testing")
  public String testing( ) {
    new UserRepository().findById(1);
      return "Joao";
  }
  

  @GetMapping("/{key}")
  public ResponseEntity<ApiResponse> getMethodName(@PathVariable String key) {
    ApiResponse response = new ApiResponse(redisService.get(key));
    return ResponseEntity.ok(response);
  }

  @PostMapping
   public ResponseEntity<String> postMethodName(@RequestBody @Validated SetDTO action) {
    redisService.set(action.getKey(), action.getValue());
    return ResponseEntity.ok("ok");
   }
}
