package com.bootcamp.demo.demo_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo.demo_jpa.entity.StaffEntity;
import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
  Optional<StaffEntity> findByName(String name);
  
}
