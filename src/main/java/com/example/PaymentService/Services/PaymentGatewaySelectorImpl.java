package com.example.PaymentService.Services;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelectorImpl implements PaymentGatewaySelector{

    RazorPaymentGW razorPaymentGW;
    StripePaymentGW stripePaymentGW;

    public PaymentGatewaySelectorImpl(RazorPaymentGW razorPaymentGW, StripePaymentGW stripePaymentGW) {
        this.razorPaymentGW = razorPaymentGW;
        this.stripePaymentGW = stripePaymentGW;
    }

    @Override
    public PaymentGateway get(){
        // By default we are choosing stripePaymentGW as default however,
        // we can write a logic to check which one to select and how.
        return stripePaymentGW;

    }
}
