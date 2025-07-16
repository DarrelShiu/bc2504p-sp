package com.bootcamp.demo.demo_api.exception;

import lombok.Getter;

@Getter
public enum SysError {
  USER_NOT_FOUND(800001, "User Not Found. please fix"),;

  private int code;
  private String message;

   private SysError(int code, String message) {
    this.message = message;
    this.code = code;
  }
}
