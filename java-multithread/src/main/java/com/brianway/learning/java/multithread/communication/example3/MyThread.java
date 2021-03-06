package com.brianway.learning.java.multithread.communication.example3;

/**
 * Created by brian on 2016/4/14.
 */
public class MyThread extends Thread {
    /*继承Thread类实现，添加锁*/
    private Object lock;

    public MyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
