package com.corejava.concurrency.usecase2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/*
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/QandE/answers.html
 * 
 * Exercise: Modify the producer-consumer example in Guarded Blocks to use a standard library class instead of the Drop class
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<String> drop =
                new SynchronousQueue<>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
