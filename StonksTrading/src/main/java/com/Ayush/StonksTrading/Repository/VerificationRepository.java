package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
