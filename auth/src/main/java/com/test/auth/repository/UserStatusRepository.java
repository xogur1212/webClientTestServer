package com.test.auth.repository;

import com.test.auth.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
    UserStatus findByCodeValue(String codeValue);
}
