package com.ryan.www.message;

import org.springframework.stereotype.Component;

/**
 * Created by Ryan on 2018/12/3.
 */
@Component
public class WechatMessageReceiver {
    public void receiveMessage(String message){
        System.out.println("收到一条微信消息："+message);
    }
}
