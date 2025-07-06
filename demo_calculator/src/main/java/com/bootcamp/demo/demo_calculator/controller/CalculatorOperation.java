package com.bootcamp.demo.demo_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_calculator.model.Cat;


public interface CalculatorOperation {

  @GetMapping(value = "/sum/{x}/{y}")
  Integer sum(@PathVariable Integer x, @PathVariable Integer y);
  
  @GetMapping(value = "/cat/{name}/{age}")
  Cat getCat(@PathVariable String name, @PathVariable Integer age);

  @GetMapping(value = "/cat2/{x}/{y}")
  Cat getCat2(@PathVariable(value = "x") Integer age,
      @PathVariable(value = "y") String name);

  @GetMapping(value = "/subtract")
  Integer subtract(@RequestParam Integer x, @RequestParam Integer y, @RequestParam Integer z);

  @GetMapping(value = "/cat3")
  Cat getCat3(@RequestParam(value = "x") String name,
      @RequestParam(value = "y") Integer age);

}
