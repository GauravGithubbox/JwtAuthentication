package com.example.jwtauthentication.serviceimpl;

import com.example.jwtauthentication.model.PaymentModel;
import com.example.jwtauthentication.services.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentModel[] getPaymentModesbyCustomerID(String customerId) {
        return new PaymentModel[]{new PaymentModel("1", "12345678", "VISA", "11/29", "INDIA")};
    }
}
