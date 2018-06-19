package com.brianway.learning.java.multithread.lock.example1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by brian on 2016/4/15.
 */
public class ServiceC {
    /*新建一个锁*/
    private Lock lock = new ReentrantLock();
    /*新建一个状态*/
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("await 时间为" + System.currentTimeMillis());
            /*condition等待开始*/
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为" + System.currentTimeMillis());
            /*condition唤醒等待*/
            condition.signal();
        } finally {
            lock.unlock();
            System.out.println("signa锁释放");
        }
    }
}
