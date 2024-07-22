package com.Ayush.StonksTrading.request;

import com.Ayush.StonksTrading.Domain.VerificationType;
import lombok.Data;

@Data
public class UpdatePasswordRequest {
    private String sendTo;
    private VerificationType verificationType;
}
