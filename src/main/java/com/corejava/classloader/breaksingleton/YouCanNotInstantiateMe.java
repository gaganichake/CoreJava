package com.corejava.classloader.breaksingleton;

public class YouCanNotInstantiateMe {

	private YouCanNotInstantiateMe(){
        System.out.println("Damn, you did it!!! . In " + YouCanNotInstantiateMe.class.getName());
    }
}
