package com.example.PaymentService.Services;

import org.springframework.stereotype.Service;


public interface PaymentGatewaySelector {

    PaymentGateway get();
}
