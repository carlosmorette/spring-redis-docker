package com.churros.http;

import java.util.List;
import java.util.Optional;

import lombok.Getter;

@Getter
public class ApiResponse {
  String message;
  Optional<List<String>> errors;
  Object data;

  public ApiResponse(Object data) {
    this.data = data;
  }
  
  public ApiResponse(String message, Optional<List<String>> errors) {
    this.message = message;
    this.errors = errors;
  }
}
