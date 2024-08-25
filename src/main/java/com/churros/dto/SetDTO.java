package com.churros.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetDTO {
  @NotBlank(message = "Não pode estar em branco.")
  private String key;
  
  @NotBlank(message = "Não pode estar em branco.")
  private String value;
}
