package com.board.board.service;

import com.board.board.model.Post;
import com.board.board.model.dto.ResultCode;

import java.util.List;

public interface IPostService {


    public Post findPostWithPostSeq(Long postSeq);

    public List<Post> findPostListWithPostName(String postName);

    public ResultCode savePost(Post post);

    public ResultCode updatePost(Post updatePost);

    public ResultCode deletePost(Long postSeq);

    public List<Post> findAll();

}
