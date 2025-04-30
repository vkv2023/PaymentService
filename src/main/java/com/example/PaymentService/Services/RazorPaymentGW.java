package com.example.PaymentService.Services;

import org.springframework.stereotype.Service;

@Service
public class RazorPaymentGW implements PaymentGateway{

    @Override
    public String generatePaymentLink() {
        return "";
    }
}
