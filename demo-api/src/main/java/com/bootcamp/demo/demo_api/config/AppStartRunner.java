package com.bootcamp.demo.demo_api.config;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_api.service.JPService;

@Component
public class AppStartRunner implements CommandLineRunner {

  @Autowired
  private JPService jpService;

    @Override
    public void run(String... args) throws Exception {
      jpService.getAndSaveUsers();
      // System.out.println("Hello !!!");
      // // throw new RuntimeException("testing");
    }

}
