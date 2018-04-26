package com.it.jms;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author huangchangling on 2018/3/1 0001
 */
public class BlockingQueueTest {


    @Test
    public void testStackLock(){
        final BlockingQueue queue = new ArrayBlockingQueue<String>(10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    queue.offer("123");
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                queue.size();
                }
            }
        }).start();

    }

}
