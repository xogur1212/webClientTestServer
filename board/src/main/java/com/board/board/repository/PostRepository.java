package com.board.board.repository;

import com.board.board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {

    Optional<Post> findByPostSeq(Long postSeq);




}
