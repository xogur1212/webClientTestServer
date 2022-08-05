package com.test.webClientTestServer.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {



    @GetMapping("")
    public ResponseEntity<?> test()     {

        log.info("here");
        return ResponseEntity.ok("ok");
    }
}
