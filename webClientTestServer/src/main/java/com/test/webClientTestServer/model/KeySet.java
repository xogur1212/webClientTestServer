package com.test.webClientTestServer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class KeySet {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long keySetSeq;

    @Column(name ="access_key")
    private String accessKey;

    @Column(name ="secret_key")
    private String secretKey;



}
