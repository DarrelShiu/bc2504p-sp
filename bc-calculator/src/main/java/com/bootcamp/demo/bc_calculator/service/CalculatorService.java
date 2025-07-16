package com.bootcamp.demo.bc_calculator.service;

import com.bootcamp.demo.bc_calculator.model.Input;

public interface CalculatorService {
  Input calculatedResult(String x, String y, String operation);
}
