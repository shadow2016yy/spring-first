package com.ryan.www.queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * created by  Ryan on  2020-07-19-10:39
 */
public class DelayQueueTest {
    static BlockingQueue<MyTask> tasks = new DelayQueue<MyTask>();
    static Random r = new Random();

    static class MyTask implements Delayed {
        String name;
        long runtime;

        MyTask(String name, long runtime) {
            this.name = name;
            this.runtime = runtime;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(runtime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
                return -1;
            } else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
                return 1;
            }
            return 0;
        }

        public String toString() {
            return name + "----" + runtime;
        }
    }

    public static void main(String[] args) throws Exception {
        long now = System.currentTimeMillis();
        MyTask t1 = new MyTask("t1", now + 1000);
        MyTask t2 = new MyTask("t2", now + 2000);
        MyTask t3 = new MyTask("t3", now + 1500);
        MyTask t4 = new MyTask("t4", now + 2500);
        MyTask t5 = new MyTask("t5", now + 500);
        tasks.put(t1);
        tasks.put(t2);
        tasks.put(t3);
        tasks.put(t4);
        tasks.put(t5);
        System.out.println(tasks);
        for(int i=0;i<5;i++){
            System.out.println(tasks.take());
        }

    }
}
