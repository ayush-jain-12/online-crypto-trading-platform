package com.Ayush.StonksTrading.Controller;

import com.Ayush.StonksTrading.Service.EmailService;
import com.Ayush.StonksTrading.Service.UserService;
import com.Ayush.StonksTrading.Service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }




}
