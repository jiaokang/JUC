package com.jk.thread01;

import lombok.extern.slf4j.Slf4j;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:22 2023/4/25
 * @ Description：runnable创建线程
 */
@Slf4j(topic = "c.test2")
public class Test02 {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            log.debug("run");
        }, "t2");

        thread.start();
    }
}
