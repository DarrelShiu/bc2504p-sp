package com.bootcamp.demo.bc_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.bc_calculator.controller.CalculatorOperation;
import com.bootcamp.demo.bc_calculator.model.Input;
import com.bootcamp.demo.bc_calculator.service.CalculatorService;


@RestController
public class CalculatorController implements CalculatorOperation {

  @Autowired
  private CalculatorService calculatorService;

  @Override
  public Input getResult(String x, String y, String operation) {
    return calculatorService.calculatedResult(x, y, operation);
  }
  
}
