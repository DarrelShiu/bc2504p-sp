package com.bootcamp.demo.bc_calculator.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.bc_calculator.model.Input;
import com.bootcamp.demo.bc_calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Autowired
  private Input input;
  
  @Override 
  public Input calculatedResult(String x, String y, String operation) {
    
    input.setX(x);
    input.setY(y);
    input.setOperation(operation);

    Double numx = Double.valueOf(input.getX());
    Double numy = Double.valueOf(input.getY());

    switch (input.getOperation()) {
      case "add":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx + numy)
            .setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "sub":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx - numy)
            .setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "mul":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx * numy)
            .setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "div":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx / numy)
            .setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      default:
        return input;
    }
  }


}
