package com.corejava.java9.stream.reactive;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

/*
 * https://www.journaldev.com/20723/java-9-reactive-streams
 * https://github.com/ReactiveX/RxJava/wiki/Backpressure
 */
public class MyPublisherAppWithProcessor {
	
	public static void main(String[] args) throws InterruptedException {
		// Create End Publisher
		SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();

		// Create Processor
		MyProcessor transformProcessor = new MyProcessor(s -> new Freelancer(s.getId(), s.getId() + 100, s.getName()));

		//Create End Subscriber
		MyFreelancerSubscriber subs = new MyFreelancerSubscriber();

		//Create chain of publisher, processor and subscriber
		publisher.subscribe(transformProcessor); // publisher to processor
		transformProcessor.subscribe(subs); // processor to subscriber

		List<Employee> emps = EmpHelper.getEmps();

		// Publish items
		System.out.println("Publishing Items to Subscriber");
		emps.forEach(publisher::submit);

		// Logic to wait for messages processing to finish
		while (emps.size() != subs.getCounter()) {
			Thread.sleep(10);
		}

		// Closing publishers
		publisher.close();
		transformProcessor.close();

		System.out.println("Exiting the app");
	}
}
