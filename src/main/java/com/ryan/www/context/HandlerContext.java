package com.ryan.www.context;

import com.ryan.www.handler.AbstractHandler;
import com.ryan.www.handler.GroupHandler;
import com.ryan.www.handler.NormalHandler;
import com.ryan.www.handler.PromotionHandler;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ryan on 2019/4/21.
 */
@Component
public class HandlerContext {
    private static Map<String,AbstractHandler> map=new HashMap<>();
    static {
        map.put("1", new NormalHandler());
        map.put("2", new GroupHandler());
        map.put("3", new PromotionHandler());
    }
    public AbstractHandler getHandler(int type){
        System.out.println("这里传入的参数是："+type);
        AbstractHandler handler = map.get(type + "");
        System.out.println("这里取到的handler是："+handler);
        return handler;
    }
}
