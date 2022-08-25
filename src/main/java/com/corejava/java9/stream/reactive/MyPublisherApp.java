package com.corejava.java9.stream.reactive;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;
/*
 * https://www.journaldev.com/20723/java-9-reactive-streams
 * 
 * 
 * https://www.reactivemanifesto.org
 * https://www.reactive-streams.org
 * https://www.journaldev.com/18948/rxjava-tutorial
 * https://github.com/ReactiveX/RxJava/wiki/Backpressure
 */

public class MyPublisherApp {

	public static void main(String[] args) throws InterruptedException {

		// Create Publisher
		SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();

		// Register Subscriber
		MySubscriber subs = new MySubscriber();
		publisher.subscribe(subs);

		List<Employee> emps = EmpHelper.getEmps();

		// Publish items
		System.out.println("Publishing Items to Subscriber");
		emps.forEach(publisher::submit);

		// logic to wait till processing of all messages are over
		while (emps.size() != subs.getCounter()) {
			Thread.sleep(10);
		}
		// close the Publisher
		publisher.close();

		System.out.println("Exiting the app");

	}
}
