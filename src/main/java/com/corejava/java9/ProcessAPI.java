package com.corejava.java9;

/*
 * Two new interfcase in Process API:
 * 
 * java.lang.ProcessHandle
 * java.lang.ProcessHandle.Info
 */
public class ProcessAPI {

	public static void main(String[] args) {
		
		
		 ProcessHandle currentProcess = ProcessHandle.current();
		 System.out.println("Current Process Id: = " + currentProcess.pid());
		 
		 System.out.println("Current Process Info: = " + currentProcess.info());
	}

}
