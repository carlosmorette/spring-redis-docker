package com.churros.factory;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import lombok.Getter;

@Getter
public class SessionFactory {
  private final String PERSISTENCE_UNIT_NAME = "churros-postgres";

  @Autowired
  private EntityManager entityManagerFactory;

  public SessionFactory() {
    this.entityManagerFactory = Persistence
        .createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
        .createEntityManager();
  }
}