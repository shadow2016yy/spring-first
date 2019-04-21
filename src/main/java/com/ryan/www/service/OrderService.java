package com.ryan.www.service;

import com.ryan.www.dto.Order;

/**
 * Created by Ryan on 2019/4/21.
 */
public interface OrderService {
    /**
     * 根据订单type进行对应的处理
     * @param order
     * @return
     */
    String handlle(Order order);

}
