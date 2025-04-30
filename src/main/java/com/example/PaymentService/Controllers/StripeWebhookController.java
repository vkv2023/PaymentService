package com.example.PaymentService.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripeWebhookController {

    @PostMapping("/stripewebhook")
    public void webhook(@RequestBody Object object){
        System.out.println(object);
    }
}
