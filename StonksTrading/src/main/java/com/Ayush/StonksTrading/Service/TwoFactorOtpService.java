package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Model.TwoFactorOTP;
import com.Ayush.StonksTrading.Model.User;

public interface TwoFactorOtpService {

    TwoFactorOTP createTwoFactorOtp(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp,String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);

}
