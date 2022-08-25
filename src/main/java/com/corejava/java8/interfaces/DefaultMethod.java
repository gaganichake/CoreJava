package com.corejava.java8.interfaces;

public interface DefaultMethod {

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
		return str == null || ("".equals(str));
	}

	// Any other abstract, default, static methods
}
