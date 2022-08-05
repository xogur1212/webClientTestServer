package com.test.webClientTestServer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/key-set")
public class KeySetController {





    @GetMapping
    public ResponseEntity<?> keySet(){


        return null;
    }
}
