package com.jk.thread01;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:22 2023/4/25
 * @ Description：FutureTask创建线程
 */
@Slf4j(topic = "c.test2")
public class Test03 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.debug("running");
                Thread.sleep(1000);
                return 10;
            }
        });

        Thread t1 = new Thread(task,"t1");
        t1.start();
        Integer integer = task.get();
        log.debug("running@"+integer);
    }
}
