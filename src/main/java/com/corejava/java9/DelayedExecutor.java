package com.corejava.java9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class DelayedExecutor {

	public static void main(String[] args) {

		Executor exe = CompletableFuture.delayedExecutor(50L, TimeUnit.SECONDS);
		
	}

}
