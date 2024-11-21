package com.subscriber.subscriber_service.event; // Align with the producer

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RegisterEvent {
    private String name;
    private Long number;
    private String email;
}

