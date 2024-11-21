package com.producer.producer_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserRegistrationDTO {
    private String name;
    private Long number;
    private String email;
}
