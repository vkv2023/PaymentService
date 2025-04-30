package com.example.PaymentService.Services;

import org.springframework.stereotype.Service;


public interface PaymentGateway {

    String generatePaymentLink();
}
