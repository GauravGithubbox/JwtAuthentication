package com.example.jwtauthentication.controller;

import com.example.jwtauthentication.model.PaymentModel;
import com.example.jwtauthentication.serviceimpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentServiceImpl;

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/getPaymentInfoByCustomerId/{customerId}")
    public ResponseEntity<PaymentModel[]> getPaymentModesbyCustomerID(@PathVariable String customerId)
    {
        PaymentModel status[]= paymentServiceImpl.getPaymentModesbyCustomerID(customerId);
        if(status.length!=0)
        {
            return ResponseEntity.ok(status);
        }
        else return ResponseEntity.notFound().build();
    }

}
