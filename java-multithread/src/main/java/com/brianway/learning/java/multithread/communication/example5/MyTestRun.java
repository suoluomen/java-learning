package com.brianway.learning.java.multithread.communication.example5;

public class MyTestRun {
    public Object lock=new Object();
    public Runnable able=new Runnable(){
        @Override
        public void run() {
            synchronized (lock){
                System.out.println();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}
