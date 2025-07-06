package com.bootcamp.demo.demo_jpa.entity;

import java.time.LocalDate;
import org.hibernate.annotations.Collate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "staffs")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class StaffEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(name = "join_date")
  private LocalDate joinDate;

  private Double salary;

  private String email;
}
