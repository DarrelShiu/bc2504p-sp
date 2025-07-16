package com.bootcamp.demo.bc_calculator.exception;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorDTO {
  private int code;
  private String message;
}