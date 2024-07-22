package com.Ayush.StonksTrading.Model;

import com.Ayush.StonksTrading.Domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
