package com.corejava.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		ConsumerThread consumer = new ConsumerThread(queue, 100);

		ProducerThread producer = new ProducerThread(queue, 100);

		new Thread(consumer).start();

		new Thread(producer).start();

	}

}
