package com.corejava.override;

public class TestStaticOverride {

	public static void main(String[] args) {
		
		Utility.print("1"); // via class reference
		
		BetterUtility.print("2"); // via class reference

		Utility u = new Utility();
		
		u.print("3"); // via object reference

		BetterUtility bu = new BetterUtility();
		
		bu.print("4"); // via object reference

		Utility uBu = new BetterUtility();
		
		// You cannot override static method. Below call will print "5 is in Utility'
		uBu.print("5"); // via object reference

	}

}
