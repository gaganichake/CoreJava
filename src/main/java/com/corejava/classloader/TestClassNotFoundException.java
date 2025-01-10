package com.corejava.classloader;

/*
Compile time (checked) exception
ClassNotFoundException is a checked exception which occurs when an application tries to load a class
through its fully -qualified name and can not find its definition on the classpath.

This occurs mainly when trying to load classes using Class.forName(), ClassLoader.loadClass() or
ClassLoader.findSystemClass(). Therefore, we need to be extra careful of java.lang.ClassNotFoundException
while working with reflection.
 */
public class TestClassNotFoundException {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
}
