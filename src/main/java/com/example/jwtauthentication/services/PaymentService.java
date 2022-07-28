package com.example.jwtauthentication.services;

import com.example.jwtauthentication.model.PaymentModel;

public interface PaymentService {
    public PaymentModel[] getPaymentModesbyCustomerID(String customerId);
}
