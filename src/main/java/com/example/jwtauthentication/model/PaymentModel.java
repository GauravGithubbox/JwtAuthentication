package com.example.jwtauthentication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModel {
    private String customerId;
    private String cardNumber;
    private String cardType;
    private String expiryDate;
    private String billingAddress;

}
