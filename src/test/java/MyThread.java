import java.util.HashMap;
import java.util.Map;

/**
 * created by  Ryan on  2020-09-22-00:25
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //run方法是 main线程在调用执行
        myThread.run();
        //start方法真正触发执行多线程
        new Thread(myThread).start();

        Map map = new HashMap<>();
        map.put("kobe","black");
        map.put("ryan","private");

        System.out.println("map中不存在的key返回值是："+map.get("james"));
    }
}
