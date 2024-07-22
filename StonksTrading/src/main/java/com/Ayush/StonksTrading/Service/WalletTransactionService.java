package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Domain.WalletTransactionType;
import com.Ayush.StonksTrading.Model.Wallet;
import com.Ayush.StonksTrading.Model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
