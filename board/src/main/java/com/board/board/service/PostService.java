package com.board.board.service;

import com.board.board.model.Post;
import com.board.board.repository.PostRepository;
import com.board.board.model.dto.ResultCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService implements IPostService {

    private final PostRepository postRepository;


    @Override
    public Post findPostWithPostSeq(Long postSeq) {

        Optional<Post> optionalPost = postRepository.findByPostSeq(postSeq);
        Post post = null;
        if (!optionalPost.isPresent()) {
            post = null;
        } else {
            post = optionalPost.get();
        }

        return post;
    }

    @Override
    public List<Post> findPostListWithPostName(String postName) {

        return null;

    }

    @Override
    @Transactional
    public ResultCode savePost(Post post) {

        Post savePost =new Post();
        savePost.setPostName(post.getPostName());
        savePost.setPostContent(post.getPostContent());
        savePost.setInsertTime(post.getInsertTime());

        return null;

    }

    @Override
    public ResultCode updatePost(Post updatePost) {
        return null;
    }

    @Override
    public ResultCode deletePost(Long postSeq) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        List<Post> postList = postRepository.findAll();
        return postList;
    }


}
