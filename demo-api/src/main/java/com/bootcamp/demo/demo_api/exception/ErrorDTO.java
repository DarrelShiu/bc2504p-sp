package com.bootcamp.demo.demo_api.exception;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorDTO {
  private int code;
  private String message;
}
