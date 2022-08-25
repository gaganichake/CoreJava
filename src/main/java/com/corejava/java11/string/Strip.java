package com.corejava.java11.string;

public class Strip {

	public static void main(String[] args) {
		
		char c = '\u2002'; //space character.
	    String text = c + " SW TEST ACADEMY ";
	    
	    System.out.println(text.trim()); //trim cannot remove unicode space character.
	    System.out.println(text.strip()); //strip can remove unicode space character.
	    
	    System.out.println(text.stripLeading());// remove left hand side spaces
	    System.out.println(text.stripTrailing());// remove right hand side spaces
	    
	    //strip() is “Unicode-aware” evolution of trim()
	    //It removes all Unicode whitespace characters (but not all control characters, such as \0)

	}

}
