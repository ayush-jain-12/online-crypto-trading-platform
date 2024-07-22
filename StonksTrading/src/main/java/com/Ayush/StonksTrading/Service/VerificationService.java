package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Domain.VerificationType;
import com.Ayush.StonksTrading.Model.User;
import com.Ayush.StonksTrading.Model.VerificationCode;

public interface VerificationService {
    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
