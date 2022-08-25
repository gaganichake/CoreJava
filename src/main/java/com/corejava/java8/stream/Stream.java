package com.corejava.java8.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Stream interface
 * 
 * A sequence of elements supporting sequential and parallel aggregate operations. 
 * 
 */
public class Stream {

    public static void main (String[] args) {
    	
        int[] ints = {1, 2, 3, 4, 5, 6};

        System.out.println("Source:" + Arrays.toString(ints));
        
        System.out.println("Creating and using new stream");
        Arrays.stream(ints).forEach(System.out::println);
        
        System.out.println("Creating and using new stream");
        Arrays.stream(ints).forEach(System.out::println);
        
        System.out.println("Creating and using new stream");
        IntStream steam = Arrays.stream(ints);
        steam.forEach(System.out::println);
        
//        System.out.println("Creating and using exsting stream");
      //Note: A stream cannot be reused after a terminal operation is called.
//        steam.forEach(System.out::println);// This will throw exception
        
        System.out.println("Creating and using new stream");
        Arrays.stream(ints).forEach(System.out::println);// This will not throw exception
    }
}
