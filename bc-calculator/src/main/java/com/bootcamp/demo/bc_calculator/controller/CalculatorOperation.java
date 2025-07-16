package com.bootcamp.demo.bc_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo.bc_calculator.model.Input;

public interface CalculatorOperation {

  @GetMapping(value = "/operation/pathvariable/{x}/{y}/{operation}")
  Input getResult(@PathVariable String x, @PathVariable String y, @PathVariable String operation);

  // @GetMapping(value = "/operation/requestpara")
  // Input getParaResult(@RequestParam (value = "x") String x, @RequestParam (value = "y") String y,
  //     @RequestParam(value = "operation") String operation);
      
  // @PostMapping(value = "/operation")
  // Input showInputOutput(@RequestBody Input input);
  
}