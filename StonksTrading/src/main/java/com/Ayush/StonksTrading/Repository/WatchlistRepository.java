package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {

    Watchlist findByUserId(Long userId);

}
