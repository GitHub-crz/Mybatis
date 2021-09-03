package com.crz;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class producer_consumer {
    public static void main(String[] args) {
        recourseLock rec = new recourseLock();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) rec.add();
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                rec.dec();
            }

        }, "B").start();
    }
}
class recourse{
    private int signal=0;
    public synchronized void dec() throws InterruptedException {
        if(signal==0){
            this.wait();
        }
        signal--;
        System.out.println(Thread.currentThread().getName()+"->"+signal);
        this.notify();
    }
    public synchronized void add() throws InterruptedException {
        if(signal!=0){
            this.wait();
        }
        signal++;
        this.notify();
        System.out.println(Thread.currentThread().getName()+"->"+signal);
    }
}
class recourseLock {
    private int signal = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void dec() {
        lock.lock();
        try {
            if (signal == 0) {
                condition.await();
            }
            signal--;
            System.out.println(Thread.currentThread().getName() + "->" + signal);
            condition.signalAll();
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }


    }

    public void add(){
        lock.lock();
        try {
            if (signal != 0) {
                condition.await();
            }
            signal++;
            System.out.println(Thread.currentThread().getName() + "->" + signal);
            condition.signalAll();
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }
}
