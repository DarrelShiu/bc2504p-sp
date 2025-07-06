package com.bootcamp.demo.demo_jpa.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Staff {

  private String name;

  private LocalDate joinDate;

  private Double salary;

  private String email;
}
