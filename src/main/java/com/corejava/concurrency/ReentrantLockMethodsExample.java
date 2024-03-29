package com.corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockMethodsExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        ReentrantLockCounter lockCounter = new ReentrantLockCounter();

        executorService.submit(() -> System.out.println("IncrementCount (First Thread) : " +
                lockCounter.incrementAndGet() + "\n"));

        executorService.submit(() -> System.out.println("IncrementCount (Second Thread) : " +
                lockCounter.incrementAndGet() + "\n"));

        executorService.shutdown();
    }
    
}
