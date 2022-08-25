package com.corejava.java11;

public class VarInLambda {

	Integer n1;
	Integer n2;
	
	public VarInLambda(Integer n1, Integer n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public static void main(String[] args) {

		
		new VarInLambda(1, 2).print((var x, var y) -> x + y);
		
		// Limitation of this feature
		//(var n1, n2) -> n1 + n2 //no skipping of var allowed
		//(var n1, String y) -> n1 + y //no mixing allowed
		//var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.
		
		// But why is this needed when we can just skip the type in the lambda?
		// If you need to apply an annotation just as @Nullable, you cannot do that without defining the type.
		
	}
	
	// Public method
	public void print(TransformFunction transform) {
		System.out.println(transform);
	}
	
	// Functional interface
	private interface TransformFunction {
		
		Integer transform(Integer n1, Integer n2);
	}

}
