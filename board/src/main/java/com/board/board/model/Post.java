package com.board.board.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name= "post")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_seq")
    private Long postSeq;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "insert_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd kk:mm:ss", timezone = "Asia/Seoul")
    private Timestamp insertTime;

    @Column(name = "update_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd kk:mm:ss", timezone = "Asia/Seoul")
    private Timestamp updateTime;

    @Column(name = "insert_user_seq")
    private Long insertUserSeq;

    @Column(name = "update_user_seq")
    private Long updateUserSeq;

}
