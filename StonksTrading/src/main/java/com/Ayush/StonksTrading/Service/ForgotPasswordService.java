package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Domain.VerificationType;
import com.Ayush.StonksTrading.Model.ForgotPasswordToken;
import com.Ayush.StonksTrading.Model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
