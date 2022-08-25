package com.corejava.java9;

public interface PrivateMethods {
	
	// Before Java 8 only Constant variables and Abstract methods were allowed
	// inside an Interface

	// public constant example
	String MONGO_DB_NAME = "ABC_Mongo_Datastore";
	String NEO4J_DB_NAME = "ABC_Neo4J_Datastore";
	String CASSANDRA_DB_NAME = "ABC_Cassandra_Datastore";

	// abstract method example
	void logInfo(String message);
	
	// In Java 8, an interface can have two more things:
	// Default methods
	// Static methods

	// default method example
	default void logWarn(String message) {
		// Step 1: Connect to DataStore
		// Step 2: Log Warn Message
		// Step 3: Close the DataStore connection
	}

	default void logError(String message) {
		// Step 1: Connect to DataStore
		// Step 2: Log Error Message
		// Step 3: Close the DataStore connection
	}

	default void logFatal(String message) {
		// Step 1: Connect to DataStore
		// Step 2: Log Fatal Message
		// Step 3: Close the DataStore connection
	}

	// static method example
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null;
	}
	
	// In Java 9, an interface can have two more things:
	
	private void log(String message, String msgPrefix) {
		// Here we have moved redundant code into a common private method
		// Step 1: Connect to DataStore
		// Step 2: Log Message with Prefix and styles etc.
		// Step 3: Close the DataStore connection
	}

	private static void displayCardDetails() {
		// Method implementation goes here.
	}
	
	// Why do we need private methods in Interface?
	// No need to write duplicate code, hence more code reusability.
	// We got the choice to expose only our intended methods implementations to clients.
	
	// Any other abstract, default, static methods

}
