package com.bootcamp.demo.demo_api.model.dto;

import java.math.BigDecimal;

public class Person {
  private double height;
  private double weight;

  public double bmi() {
    return BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.height)))
        .doubleValue();
  }

  public static double bmi(double height, double weight) {
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(height).multiply(BigDecimal.valueOf(height)))
        .doubleValue();
  }

}
