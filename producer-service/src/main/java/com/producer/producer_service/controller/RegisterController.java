package com.producer.producer_service.controller;

import com.producer.producer_service.dto.UserRegistrationDTO;
import com.producer.producer_service.service.RegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public ResponseEntity<String> registration(@RequestBody UserRegistrationDTO userRegistrationDTO){
        registerService.sendRegistrationMessage(userRegistrationDTO);
        return ResponseEntity.ok("Message sent");
    }
}
