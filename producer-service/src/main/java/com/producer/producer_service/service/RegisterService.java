package com.producer.producer_service.service;

import com.producer.producer_service.dto.UserRegistrationDTO;
import com.producer.producer_service.event.RegisterEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public RegisterService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendRegistrationMessage(UserRegistrationDTO userRegistrationDTO){
        RegisterEvent newRegisterEvent = RegisterEvent.builder()
                .email(userRegistrationDTO.getEmail())
                .name(userRegistrationDTO.getName())
                .number(userRegistrationDTO.getNumber())
                .build();
        kafkaTemplate.send("registration-otp",newRegisterEvent);
        System.out.println("EMAIL SENT FROM PRODUCER.");
    }
}
