package com.ryan.www.handler;

import com.ryan.www.dto.Order;

/**
 * Created by Ryan on 2019/4/21.
 */
public abstract  class AbstractHandler {

    abstract public String handle(Order order);
}
