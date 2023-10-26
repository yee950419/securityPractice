package com.study.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @GetMapping
    public ResponseEntity<?> showReview() {

        return ResponseEntity.ok().body("show review success!");
    }

    @PostMapping
    public ResponseEntity<?> writeReview() {

        return ResponseEntity.ok().body("review write success!");
    }
}
