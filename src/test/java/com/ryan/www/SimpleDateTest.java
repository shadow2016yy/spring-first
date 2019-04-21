package com.ryan.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ryan on 2019/4/10.
 */
public class SimpleDateTest {
    private ThreadLocal<SimpleDateFormat> threadLocal=new ThreadLocal<SimpleDateFormat>();
    protected SimpleDateFormat initValue(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i=0;i<20;i++){
            service.execute(()->{
                try {
                    System.out.println(simpleDateFormat.parse("2018-01-02 08:23:23"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);
    }
}
