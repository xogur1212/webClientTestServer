package com.voicestore.auth.repository;

import com.voicestore.auth.model.Permit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitRepository extends JpaRepository<Permit,Long> {

//    Permit findByCodeValue(String codeValue);
//
//    Permit findByCodeSeq(int codeSeq);
}
