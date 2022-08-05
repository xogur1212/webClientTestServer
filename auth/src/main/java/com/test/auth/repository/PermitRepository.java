package com.test.auth.repository;

import com.test.auth.model.Permit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitRepository extends JpaRepository<Permit,Long> {

//    Permit findByCodeValue(String codeValue);
//
//    Permit findByCodeSeq(int codeSeq);
}
