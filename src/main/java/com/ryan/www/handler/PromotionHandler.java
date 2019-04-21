package com.ryan.www.handler;

import com.ryan.www.annotation.HandlerType;
import com.ryan.www.dto.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Ryan on 2019/4/21.
 */
@Component
@HandlerType("3")
public class PromotionHandler extends  AbstractHandler {
    @Override
    public String handle(Order order) {
        return "处理促销订单";
    }
}
