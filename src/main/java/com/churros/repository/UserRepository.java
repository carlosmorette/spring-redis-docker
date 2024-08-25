package com.churros.repository;

import com.churros.domain.UserEntity;
import com.churros.factory.SessionFactory;

public class UserRepository {

  private SessionFactory sessionFactory = new SessionFactory();
  
  public void findById(Integer id) {
    var x = sessionFactory.getEntityManagerFactory().find(UserEntity.class, id);
    var y = 1;
  }
}