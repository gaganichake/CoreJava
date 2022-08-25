package com.corejava.override.exception;

import java.io.FileNotFoundException;
import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.util.ArrayList;

// When you override a method, you can specialize or avoid (omit) an exception
// but you can not generalize an exception or add a new exception.
public class SubClass extends SuperClass {

	// Omit SQLException	
//	@Override
//	public ArrayList getNetSalary(int id) {
//		// Works
//		return new ArrayList();
//	}
	
	// Throws a specialized exception (subclass) of SQLException
//	@Override
//	public ArrayList getNetSalary(int id) throws BatchUpdateException{
//		// Works
//		return new ArrayList();
//	}

	// Add one more exception - error
//	@Override
//	public ArrayList getNetSalary(int id) throws SQLException, FileNotFoundException{
//		// Does NOT Work
//		return new ArrayList();
//	}
	
	
	// Throws a generalized exception of SQLException - error
//	@Override
//	public ArrayList getNetSalary(int id) throws Exception{
//		// Does NOT Work
//		return new ArrayList();
//	}
	
}
