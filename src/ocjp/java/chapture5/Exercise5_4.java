package ocjp.java.chapture5;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_4 {
	public static void main(String[] args) {
		
		try {
			checkFood(args[0]);
			System.out.println("It likes the food");
		} catch (BadFoodException e) {
			e.printStackTrace();
		}
	}
	
	private static void checkFood(String arg) throws BadFoodException{
		
		List goodFoodList = new ArrayList();
		goodFoodList.add("Rice");
		goodFoodList.add("Milk");
		goodFoodList.add("Vegetable");
		
		if(!goodFoodList.contains(arg)){
			throw new BadFoodException();
		}
	}
}
