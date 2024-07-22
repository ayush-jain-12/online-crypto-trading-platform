package com.Ayush.StonksTrading.Service;

import com.Ayush.StonksTrading.Domain.OrderType;
import com.Ayush.StonksTrading.Model.Coin;
import com.Ayush.StonksTrading.Model.Order;
import com.Ayush.StonksTrading.Model.OrderItem;
import com.Ayush.StonksTrading.Model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
