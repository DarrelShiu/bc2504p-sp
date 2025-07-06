package com.bootcamp.demo.bc_calculator.model;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Input {
  private String x;
  private String y;
  private String operation;
  private String result;
}
