package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {

    public Wallet findByUserId(Long userId);


}
