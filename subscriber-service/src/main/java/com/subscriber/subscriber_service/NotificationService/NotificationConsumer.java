package com.subscriber.subscriber_service.NotificationService;

import com.producer.producer_service.event.RegisterEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "registration-otp", groupId = "notification-service")
    public void processRegistrationOtp(RegisterEvent message) {
        System.out.println("Processing Registration OTP: " + message.getName());
        // Implement logic to send the registration OTP email
    }

    @KafkaListener(topics = "forgot-password-otp", groupId = "notification-service")
    public void processForgotPasswordOtp(RegisterEvent message) {
        System.out.println("Processing Forgot Password OTP for: " + message.getEmail());
        // Implement logic to send the forgot password OTP email
    }

    @KafkaListener(topics = "user-verified", groupId = "notification-service")
    public void processWelcomeEmail(RegisterEvent message) {
        System.out.println("Processing Welcome Email for: " + message.getNumber());
        // Implement logic to send the welcome email
    }
}
