package com.bootcamp.demo.demo_api.respository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.demo.demo_api.entity.UserEntity;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  // JPA Methods
  Optional<UserEntity> findByJphUserId(Long jphUserId);
}
