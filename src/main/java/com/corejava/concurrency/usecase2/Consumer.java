package com.corejava.concurrency.usecase2;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> drop;

    public Consumer(BlockingQueue<String> drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();
        try {
            for (String message = drop.take();
                 ! message.equals("DONE");
                 message = drop.take()) {
                System.out.format("MESSAGE RECEIVED: %s%n",
                                  message);
                Thread.sleep(random.nextInt(5000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
