package com.Ayush.StonksTrading.request;

import com.Ayush.StonksTrading.Domain.OrderType;
import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
