package com.corejava.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingNumbers {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		//1. Using Stream.reduce()
		
		Integer sum = integers.stream()
				  .reduce(0, (a, b) -> a + b);// the accumulator function is a lambda expression that adds two Integer values and returns an Integer value:
		
		sum = integers.stream()
				.reduce(0, Integer::sum);//Where sum is static method of class Integer
		
		sum = integers.stream()
				  .reduce(0, ArithmeticUtils::sum);//Using our customer implementation of sum
		
		//2. Using Stream.collect()
		sum = integers.stream()
		  .collect(Collectors.summingInt(Integer::intValue));
		
		//3. Using IntStream.sum()
		sum = integers.stream()
		  .mapToInt(Integer::intValue)
		  .sum();
		
		// Apply all previous techniques in 4., 5., & 6.
		
		//4. Using Stream#sum With Objects. 
		Item item1 = new Item(1, 10);
		Item item2 = new Item(2, 15);
		Item item3 = new Item(3, 25);
		Item item4 = new Item(4, 40);
		        
		List<Item> items = Arrays.asList(item1, item2, item3, item4);
		
		
		sum = items.stream()
				  .map(item -> item.getPrice())
				  .reduce(0, (a, b) -> a + b);
		
		sum = items.stream()
				  .map(x -> x.getPrice())
				  .reduce(0, Integer::sum);
		
		sum = items.stream()
				  .map(x -> x.getPrice())
				  .reduce(0, ArithmeticUtils::sum);
		
		sum = items.stream()
				  .map(x -> x.getPrice())
				  .collect(Collectors.summingInt(Integer::intValue));
		
		sum = items.stream()
				  .mapToInt(x -> x.getPrice())
				  .sum();
		
		//5. Using Stream#sum With Map 
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 5);
		map.put("c", 2);
		
		sum = map.values()
		  .stream()
		  .mapToInt(Integer::valueOf)
		  .sum();
		
		//6. Using Stream#sum With String.
		String string = "Item1 10 Item2 25 Item3 30 Item4 45";
		
		sum = Arrays.stream(string.split(" "))
			    .filter((s) -> s.matches("\\d+"))
			    .mapToInt(Integer::valueOf)
			    .sum();
		
		System.out.println(sum);
	}
	
	public static class ArithmeticUtils {

	    public static int sum(int a, int b) {
	        return a + b;
	    }
	}
	
	public static class Item {

	    private int id;
	    private Integer price;

	    public Item(int id, Integer price) {
	        this.id = id;
	        this.price = price;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}
	}

}

