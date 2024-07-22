package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Model.Coin;
import com.Ayush.StonksTrading.Model.User;
import com.Ayush.StonksTrading.Model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
