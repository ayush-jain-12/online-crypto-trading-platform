package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Model.PaymentDetails;
import com.Ayush.StonksTrading.Model.User;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
