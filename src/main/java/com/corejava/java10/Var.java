package com.corejava.java10;// syntactically correct

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Local Variable Type Inference
 * 
 * We can use var only in declarations:
 *  1. Limited only to Local Variable with initializer
 *  2. Indexes of enhanced for loop or indexes
 *  3. Local declared in for loop
 * It is not allowed for null and cannot be used for parameters or return types.
 * It is not allowed for Lambda declarations.
 * It is not a keyword, it’s a reserved type name
 * 
 * 
 * Benefits of Local Variable Type Inference:
 * It improves the developer experience
 * It reduces code ceremony
 * It reduces boiler plate code
 * Increases code clarity
 * 
 */
public class Var {// syntactically correct

	public static void main(String[] args) {
		
		// Local Variable with initializer
		var number = 20;
		var arr = new Integer[10];
        var numberList = List.of(1, 2, 3, 4);
        var footballerMap = Map.of(1, "Ronaldo", 2, "Messi");
        var var = "Var Test!"; //syntactically correct, var is not a keyword.
        // It can be used as an identifier or even as a method name or package name.
        
        // Index of Enhanced For Loop
        for (var n : numberList) {
        	System.out.println(n);
        }
        // Local variable declared in a loop
		for (Integer integer : numberList) {
			System.out.println(integer);
		}
        
        //var x;// Cannot use 'var' on variable without initializer
        //var x = 5, y = 10;// 'var' is not allowed in a compound declaration
        //var text = null; // null cannot be used as an initializer 
        //var intArr[] = new Integer[10]; // 'var' is not allowed as an element type of an array. Cannot have brackets.
        //var nums = {1,2,3,4,5};// Array initializer needs an explicit target-type
        //var multiply = number -> number * number; // Lambda expression needs an explicit target-type
        //var minimum = Math::min;// method reference needs an explicit target-type
        
        System.out.println(number);
        System.out.println(numberList);
        System.out.println(footballerMap);
        System.out.println(var);
        
        // Generics with Local Variable Type Inference
        var map1 = new HashMap<>(); // Inferred as HashMap<Object, Object>
        var map2 = new HashMap<>(); // Inferred as HashMap<Object, Object>

        
        // Anonymous Class Types
        var runnable = new Runnable() {
        	@Override
        	public void run() {
        		var numbers = List.of(5, 4, 3, 2, 1);
        		for (var number : numbers) {
        			System.out.println(number);
        		}
        	}
        };
        
        // Non Denotable Types. An expression that cannot be inferred to a specific type is known as Non Denotable Type.
        var map3 = new HashMap<>() { // anonymous class extends HashMap
        	int someVar;
        };
        
        var person = new Object() {
        	class Name {
        		String firstName;
        		final String lastName;
        		public Name(String firstName, String lastName) {
        			super();
        			this.firstName = firstName;
        			this.lastName = lastName;
        		}
        		public String getFirstName() {
        			return firstName;
        		}
        		public void setFirstName(String firstName) {
        			this.firstName = firstName;
        		}
        	}
        	Name name;
        	String description;
        	public String displayName() {
        		return name.getFirstName() + " " + name.lastName;
        	}
        };
        person.name = person.new Name("John", "Doe");
        System.out.println(person.displayName());
        
        
        // Does this mean that now Java is a dynamically typed language? Not really, it’s still a statically typed language.
        // The compiler properly infers the type of the variable from the right-hand side expression and adds that to the bytecode.

	}
	
	public static void var() { }// syntactically correct 
	
	//class var{ }// not allowed
	
	//interface var{ }// not allowed

}
