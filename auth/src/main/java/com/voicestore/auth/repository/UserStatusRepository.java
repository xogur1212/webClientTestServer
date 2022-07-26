package com.voicestore.auth.repository;

import com.voicestore.auth.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
    UserStatus findByCodeValue(String codeValue);
}
