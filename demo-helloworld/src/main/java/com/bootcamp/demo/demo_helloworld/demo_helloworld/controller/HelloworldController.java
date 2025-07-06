package com.bootcamp.demo.demo_helloworld.demo_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")
public class HelloworldController {
  
  @GetMapping(value = "/hello") // api endpoint (avoid duplicate endpoint URL)
  // public String helloworld() {
  //   return "Hello. Welcome to Spring Boot v123456!!!!";
  // }

   public String helloworld() {
    return "hello world" + 123;
  }
}
