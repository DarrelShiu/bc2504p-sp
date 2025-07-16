package com.bootcamp.demo.bc_calculator.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(value = RuntimeException.class)
  public ErrorDTO catchRuntimeException (RuntimeException ex) {
    return ErrorDTO.builder() //
      .code(9) //
      .message("Invalid input") //
        .build();
  }
}
