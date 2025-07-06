package com.bootcamp.demo.bc_calculator.controller.impl;

import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.bc_calculator.controller.CalculatorOperation;
import com.bootcamp.demo.bc_calculator.model.Input;
import java.math.BigDecimal;


@RestController
public class CalculatorController implements CalculatorOperation {
  
  @Autowired
  private Input input;
  
  @Override
  public Input getResult(String x, String y, String operation) {
    Double numx = Double.valueOf(x);
    Double numy = Double.valueOf(y);

    input.setX(x);
    input.setY(y);
    input.setOperation(operation);

    switch (operation) {
      case "add":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx + numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "sub":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx - numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "mul":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx * numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "div":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx / numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      default:
        return input;
    }
  }
  
  @Override
  public Input getParaResult(String x, String y, String operation) {
    Double numx = Double.valueOf(x);
    Double numy = Double.valueOf(y);

    input.setX(x);
    input.setY(y);
    input.setOperation(operation);

    switch (operation) {
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
  
  @Override
  public Input getInput(Input input) {
    Double numx = Double.valueOf(input.getX());
    Double numy = Double.valueOf(input.getY());

    input.setX(input.getX());
    input.setY(input.getY());
    input.setOperation(input.getOperation());

    switch (input.getOperation()) {
       case "add":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx + numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "sub":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx - numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "mul":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx * numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      case "div":
        input.setResult(String.valueOf(BigDecimal.valueOf(numx / numy).setScale(5, RoundingMode.HALF_UP).doubleValue()));
        return input;
      default:
        return input;
    }
  }
  
}
