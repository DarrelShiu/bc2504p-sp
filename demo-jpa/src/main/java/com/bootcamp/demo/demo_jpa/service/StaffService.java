package com.bootcamp.demo.demo_jpa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo.demo_jpa.entity.StaffEntity;
import com.bootcamp.demo.demo_jpa.model.Staff;

public interface StaffService {
  StaffEntity save(StaffEntity staffEntity);
  Optional<StaffEntity> findById(Long id);
  List<StaffEntity> findALL();
  Boolean deleteById(Long id);
  StaffEntity updateById(Long id, StaffEntity staffEntity);
  StaffEntity updateNameById(Long id, String name);

  // StaffEntity getStaffById(@PathVariable Long x);
  // List<StaffEntity> getAllStaffs();
  // StaffEntity deleteStaffById(@PathVariable Long x);
  // StaffEntity updateStaffById(@PathVariable Long id, @RequestBody Staff staff);
  // StaffEntity updateStaffNameById(@PathVariable Long id, @PathVariable String name);
}
