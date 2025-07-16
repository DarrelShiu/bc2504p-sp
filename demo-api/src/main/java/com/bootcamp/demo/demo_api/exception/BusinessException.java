package com.bootcamp.demo.demo_api.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
  private int code;

  public BusinessException(SysError sysError) {
    super(sysError.getMessage());
    this.code = sysError.getCode();
  }

  // private BusinessException(int code, String message) {
  //   super(message);
  //   this.code = code;
  // }
}
