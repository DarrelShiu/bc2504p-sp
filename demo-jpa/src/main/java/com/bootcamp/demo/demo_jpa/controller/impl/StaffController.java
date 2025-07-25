package com.bootcamp.demo.demo_jpa.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_jpa.controller.StaffOperation;
import com.bootcamp.demo.demo_jpa.entity.StaffEntity;
import com.bootcamp.demo.demo_jpa.model.Staff;
import com.bootcamp.demo.demo_jpa.service.StaffService;

@RestController
public class StaffController implements StaffOperation {
  @Autowired
  private StaffService staffService;
  
  @Override
  public StaffEntity createStaff(Staff staff) {
    StaffEntity staffEntity =
        StaffEntity.builder().name(staff.getName()).email(staff.getEmail())
            .joinDate(staff.getJoinDate()).salary(staff.getSalary()).build();
    return this.staffService.save(staffEntity);
  }
  
  @Override
  public StaffEntity getStaffById(Long id) {
    return this.staffService.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("id not exists."));
  }

  @Override
  public List<StaffEntity> getAllStaffs() {
    return this.staffService.findALL();
  }

  @Override
  public Boolean deleteStaffById(Long id) {
    return this.staffService.deleteById(id);
  }

  @Override
  public StaffEntity updateStaffById(Long id, @RequestBody Staff staff) {
    StaffEntity staffEntity =
        StaffEntity.builder().name(staff.getName()).email(staff.getEmail())
            .joinDate(staff.getJoinDate()).salary(staff.getSalary()).build();
    return this.staffService.updateById(id, staffEntity);
  }

  @Override
  public StaffEntity updateStaffNameById(Long id, String name) {
    return this.staffService.updateNameById(id, name);
  }
  

}
