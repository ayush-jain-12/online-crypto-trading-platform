package com.Ayush.StonksTrading.Service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.Ayush.StonksTrading.Domain.PaymentMethod;
import com.Ayush.StonksTrading.Model.PaymentOrder;
import com.Ayush.StonksTrading.Model.User;
import com.Ayush.StonksTrading.Response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
