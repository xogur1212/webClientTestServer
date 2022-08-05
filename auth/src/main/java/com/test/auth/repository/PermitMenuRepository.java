package com.test.auth.repository;

import com.test.auth.model.PermitMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitMenuRepository extends JpaRepository<PermitMenu, Long> {

    PermitMenu findByCodeValue(String codeValue);

}
