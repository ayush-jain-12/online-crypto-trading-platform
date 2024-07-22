package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
