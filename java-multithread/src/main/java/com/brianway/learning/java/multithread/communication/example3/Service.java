package com.brianway.learning.java.multithread.communication.example3;

/**
 * Created by brian on 2016/4/14.
 */
public class Service {
    public void testMethod(Object lock) {
        /*方法中添加锁*/
        try {
            synchronized (lock) {
                System.out.println("begin wait(),ThreadName=" + Thread.currentThread().getName());
                /*使用wait方法后直接等待，后面代码不执行*/
                lock.wait();
                System.out.println("end wait(),ThreadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
