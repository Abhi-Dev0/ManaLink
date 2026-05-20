package io.manalink.test_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-api")
public class TestController {

    @Value("${test.msg}")
    private String msg;

    @GetMapping
    public ResponseEntity<String> testApi(){
        return ResponseEntity.ok(msg);
    }

}
