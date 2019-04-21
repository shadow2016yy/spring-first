package com.ryan.www.service;

import com.ryan.www.context.HandlerContext;
import com.ryan.www.dto.Order;
import com.ryan.www.handler.AbstractHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ryan on 2019/4/21.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private HandlerContext context;
    @Override
    public String handlle(Order order) {
        AbstractHandler handler = context.getHandler(order.getType());
        String result = handler.handle(order);
        return result;
    }
}
