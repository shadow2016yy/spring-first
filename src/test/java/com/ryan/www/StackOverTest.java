package com.ryan.www;

/**
 * created by  Ryan on  2020-08-25-12:53
 */
public class StackOverTest {
    int i=0;
    public void test(){
        i++;
        test();
    }
    public static void main(String[] args) {
        StackOverTest stackOverTest = new StackOverTest();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            stackOverTest.test();
        }catch (Throwable e){
            System.out.println(stackOverTest.i);

        }

    }
}
