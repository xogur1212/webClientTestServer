package com.board.board.controller;


import com.board.board.model.Post;
import com.board.board.model.dto.ResultCode;
import com.board.board.service.IPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final IPostService postService;

    @GetMapping("/{intPostSeq}")
    public ResponseEntity<?> findPostWithPostSeq(@PathVariable int intPostSeq){
        Long postSeq = Long.valueOf(intPostSeq);
        Post post = postService.findPostWithPostSeq(postSeq);

        return ResponseEntity.ok(post);
    }

    @PostMapping("")
    public ResponseEntity<?> findAllPost(){
        List<Post> postList = postService.findAll();

        return ResponseEntity.ok(postList);
    }

    @PutMapping("")
    public ResponseEntity<?> savePost(@RequestBody Post post){
        ResultCode resultCode =postService.savePost(post);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(resultCode);

    }

    @PatchMapping("")
    public ResponseEntity<?> updatePost(@RequestBody Post post){
        ResultCode resultCode =postService.updatePost(post);

        return ResponseEntity.status(HttpStatus.OK)
                .body(resultCode);

    }

    @DeleteMapping("/{intPostSeq}")
    public ResponseEntity<?> deletePost(@PathVariable int intPostSeq){
        Long postSeq =Long.valueOf(intPostSeq);
        ResultCode resultCode =postService.deletePost(postSeq);

        return ResponseEntity.status(HttpStatus.OK)
                .body(resultCode);
    }



}
