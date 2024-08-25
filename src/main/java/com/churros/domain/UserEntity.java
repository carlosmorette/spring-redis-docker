package com.churros.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class UserEntity {
  @Id @GeneratedValue
  private Integer id;

  @NotNull @Size(max = 10)
  private String name;
}
