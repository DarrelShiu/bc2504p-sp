package com.bootcamp.demo.demo_calculator.controller.impl;

import com.bootcamp.demo.demo_calculator.controller.CalculatorOperation;
import com.bootcamp.demo.demo_calculator.model.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController implements CalculatorOperation {
    @Override
    public Integer sum(Integer x, Integer y) {
      return x + y;
    }

    @Override
    public Cat getCat(String name, Integer age) {
      return new Cat(name, age);
    }

    @Override
    public Cat getCat2(Integer age, String name) {
      return new Cat(name, age);
    }

    @Override
    public Integer subtract(Integer x, Integer y, Integer z) {
      return (x - y) * z;
    }

    @Override
    public Cat getCat3(String name, Integer age) {
    return new Cat(name, age);
    }
    
}
