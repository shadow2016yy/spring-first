package com.ryan.www.service;

import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * Created by Ryan on 2019/7/1.
 */
@Service
public class RemoteService {

    @Retryable(value= {Exception.class},maxAttempts = 3,backoff = @Backoff(delay = 5000l,multiplier = 1))
    public void call() throws Exception {
        System.out.println("do something...");
        throw new Exception("RPC调用异常");
    }
    @Recover
    public void recover(RemoteAccessException e) {
        System.out.println(e.getMessage());
    }

}
