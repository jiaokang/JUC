package com.jk.thread01;

import lombok.extern.slf4j.Slf4j;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 21:48 2023/4/25
 * @ Description：线程创建
 */
@Slf4j(topic = "c.test1")
public class Test01 {

    public static void main(String[] args) {
        java.lang.Thread thread = new java.lang.Thread(){
            @Override
            public void run() {
                log.debug("running");
            }
        };
        thread.start();
        log.debug("running");
    }

}
