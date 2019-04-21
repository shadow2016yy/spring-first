package com.ryan.www.service;

import com.ryan.www.dto.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ryan on 2019/4/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void  testStrategy(){
        Order order= Order.builder().type(1).build();
        String handlle = orderService.handlle(order);
        System.out.println(handlle);
    }
}
