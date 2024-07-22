package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Model.CoinDTO;
import com.Ayush.StonksTrading.Response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
