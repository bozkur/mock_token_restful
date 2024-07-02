package com.example.mock_token_restful.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cevher
 */
@RestController
public class MockController {

    @GetMapping("/tokenService")
    public ResponseEntity authToken(@RequestParam(required = false) String username, @RequestParam(required = false) String password) {
        System.out.println("User name: " + username + " Password: " + password);
        if ("12345".equals(password)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(401).build();
    }

}
