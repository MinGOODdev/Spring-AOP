package com.springboot.aop.cases.first.service;

import com.springboot.aop.domain.User;
import com.springboot.aop.cases.first.SuperPerformance;
import com.springboot.aop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceFirstStep extends SuperPerformance<User> {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }

}
