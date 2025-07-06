package com.bootcamp.demo.demo_jpa.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo.demo_jpa.entity.StaffEntity;
import com.bootcamp.demo.demo_jpa.model.Staff;
import jakarta.persistence.Column;
import java.util.List;

public interface StaffOperation {
  @PostMapping(value = "/staff")
  StaffEntity createStaff(@RequestBody Staff staff);

  @GetMapping(value = "/staff/{id}")
  StaffEntity getStaffById(@PathVariable Long id);

  @GetMapping(value = "/staffs")
  List<StaffEntity> getAllStaffs();

  @DeleteMapping(value = "/staff/{id}")
  Boolean deleteStaffById(@PathVariable Long id);

  @PutMapping(value = "/staff/{id}")
  StaffEntity updateStaffById(@PathVariable Long id, @RequestBody Staff staff);

  @PatchMapping(value = "/staff/id/{id}/name/{name}")
  StaffEntity updateStaffNameById(@PathVariable Long id, @PathVariable String name);
  
  // private Long id;
  // private String name;
  // private LocalDate joinDate;
  // private Double salary;
  // private String email;
}
