package com.corejava.java8.stream.terminal.shortcircuit;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * Short-circuit Terminal Operations:
 * 
 * Optional<T> findAny()
 * 
 * Returns an Optional instance which wraps any and only one element of the stream.
 * 
 * According to Java doc: "The behavior of this operation is explicitly nondeterministic; 
 * it is free to select any element in the stream. This is to allow for maximal performance 
 * in parallel operations; the cost is that multiple invocations on the same source may not 
 * return the same result. (If a stable result is desired, use findFirst() instead."
 * 
 * A deterministic operation will always produce the same output for a given input, regardless
 * of we use parallel or sequential pipeline.
 * 
 * Except for operations identified as explicitly nondeterministic, such as findAny(), whether 
 * a stream executes sequentially or in parallel should not change the result of the computation.
 * 
 * For a sequential stream there won't be any difference between 'findFirst' and 'findAny'. 
 * But for a parallel stream findAny will return 'any' element rather than waiting for the 
 * 'first' element
 * 
 */
public class FindAny {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel();
		
		OptionalInt opt = stream.filter(i -> i % 2 == 0).findAny();
		 
		if (opt.isPresent()) {
			System.out.println(opt.getAsInt());//The result might vary on multiple executions.
		}

	}

}
