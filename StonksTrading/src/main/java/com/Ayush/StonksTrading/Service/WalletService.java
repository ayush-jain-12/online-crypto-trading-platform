package com.Ayush.StonksTrading.Service;


import com.Ayush.StonksTrading.exception.WalletException;
import com.Ayush.StonksTrading.Model.Order;
import com.Ayush.StonksTrading.Model.User;
import com.Ayush.StonksTrading.Model.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
