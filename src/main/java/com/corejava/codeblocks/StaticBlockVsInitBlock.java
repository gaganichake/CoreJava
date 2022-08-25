package com.corejava.codeblocks;

/*
 * The static block is loaded when the class is loaded by the JVM for the 1st time 
 * only whereas init {} block is loaded every time class is loaded. Also, first the
 * static block is loaded then the init block.
 * 
 */
public class StaticBlockVsInitBlock {
	
 
    {
        System.out.println("Inside init");
    }
    
    static {
        System.out.println("Inside static");
    }
 
    public static void main(String[] args){
        new StaticBlockVsInitBlock();
        new StaticBlockVsInitBlock();
        new StaticBlockVsInitBlock();
   }
}
