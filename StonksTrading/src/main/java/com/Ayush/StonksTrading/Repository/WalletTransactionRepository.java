package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.Wallet;
import com.Ayush.StonksTrading.Model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
