package com.ryan.www.thread;

import java.util.concurrent.Callable;

public class CallerTask implements Callable<String> {
    public String call() throws Exception {
        return "hello";
    }
}
