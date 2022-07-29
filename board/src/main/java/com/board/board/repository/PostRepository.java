package com.board.board.repository;

import com.board.board.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {

    Optional<Post> findByPostSeq(Long postSeq);

    List<Post> findAllByPostNameIgnoreCaseLike(String postName, Pageable pageable);
    Long deleteByPostSeq(Long postSeq);


}
