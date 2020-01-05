package com.ryan.www.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallTest {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        new Thread(futureTask).start();
        String s = null;
        try {
            s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
