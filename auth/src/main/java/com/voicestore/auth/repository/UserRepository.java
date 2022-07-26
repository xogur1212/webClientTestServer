package com.voicestore.auth.repository;

import com.voicestore.auth.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserId(String id);

    User findByUserSeq(Long userSeq);

    Long deleteByUserSeq(int id);

    List<User> findAll();

    Page<User> findAll(Pageable pageable);

    Page<User> findAll(Specification<User> spec, Pageable pageable);

    Optional<User> findByEmail(String email);

    Optional<User> findByUserName(String userName);
}
