package com.example.juc_test.future;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mob
 * @Description
 * @date 2023/11/15 16:59
 */
public class ThreadDemo01 {
    Lock lock = new ReentrantLock();
    MyThread myThread = new MyThread();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 6, 3, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }








}

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(11111);
        return 1;
    }
}
