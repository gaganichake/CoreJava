package com.corejava.java9.modules;

/*
 * Platform module system
 * 
 * Modular JDK
 * Modular Java Source Code
 * Modular Run-time Images
 * Encapsulate Java Internal APIs
 * Java Platform Module System

https://www.journaldev.com/13106/java-9-modules
https://www.journaldev.com/13596/javase9-module-basics-part2
https://www.journaldev.com/13543/javase9-simple-module-cmd-prompt-part3
https://www.journaldev.com/13630/javase9-helloworld-module-ides-part4

A Module = Code + Data (+ Resources)

The main goal of Java 9 Module System is to support Modular Programming in Java.
Its easy to support Less Coupling between components
Its easy to support Single Responsibility Principle (SRP).

Like Java 8 applications have Packages as a Top level components, Java 9 applications have Module as Top Level components.
Each Java 9 Module have one and only one Module and one Module Descriptor.

In brief, a Java 9 Module contains the following main components:
One Module
Module Name
Module Descriptor
Set of Packages
Set of Types and Resources


In Simple Terms, Java has these many First class citizens:

  In OOP (Object Oriented Programming)  = Object 
  In FP (Functional Programming)        = Function or Lambda
  In Module System (Modular Programming)= Module
  
Java 9 Module Rules:
Each module has a unique Name.
Each module has some description in a source file.
A Module description is expressed in a source file called “module-info.java”.
As “module-info.java” file describes a Module, it is also known as “Module Descriptor”.
A Module Descriptor is a Java file. It is not an XML, Text file or Properties file.
By convention, we should use same name “module-info.java” for Module Descriptor.
By convention, Module Descriptor file is placed in the top level directory of a Module.
Each Module can have any number of Packages and Types.
As of now, JDK 9 EA (Early Access) have 95 modules.
We can create our own modules.
One Module can dependent on any number of modules.
Each Module should have one and only one Module Descriptor (“module-info.java”).

Java 9 Module Descriptor:
Module Descriptor (“module-info.java”) is a one of the Resources in Java 9 Module
Module Descriptor is a resource, which contains Module Meta Data. It is NOT an XML or a properties file, it's a plain Java file
Like package names and JAR file names, we can use Reverse Domain Name pattern to define a module name

Module Meta Data (module-info.java):
A unique name.
exports clause.
requires clause.

module com.app.mod1 {
   exports com.app.services;
   requires com.otherapp.services;
}
A Module Descriptor is created using “module” keyword.
A Module can exports it’s packages to outside world using 'exports' clause so that other Modules can use them.
It is not mandatory to export all packages. It’s up-to the Module Owner to decide which one to export and which one not.
A Module can import or use other modules packages using 'requires' clause
A "requires" clause does same what java "imports" does.
A Module Descriptor can have zero, one or more 'exports' clause.
A Module Descriptor can have zero, one or more 'requires' clause.
A Module Descriptor can have only 'exports' clause, no 'requires' clause. 
A Module Descriptor can have both 'exports' clause and 'requires' clause.

Note: 
“module”, “requires”, and “exports”  are not Java keywords.
They are just “Contextual Keywords”. That means they are keywords only with a Module Descriptor (“module-info.java”) file.
If we used them as Identifiers in the existing code base, Java Compiler or Run-time does NOT throw any error or Exceptions at compile-time and run-time.
int module = 10
String requires = "Hello World"
String exports = "Me"
All three statements work in Java 9

MODULEPATH vs CLASSPATH:
Java 9 supports both MODULEPATH and CLASSPATH.
In Java 9, we can develop both Public API and Private API in a Module.
A ClassPath is a sequence of classes and packages (or simply JARs) which are user-defined classes and built-in classes. JVM or Java Compiler requires this to compile the application or classes.
A ModulePath is a sequence of Modules (which are provided in a Folder format or JAR format). If a Module is in folder format, that means its in Exploded Module format. If its in a JAR format, that jar is know as “Modular JAR“.

 */
public class HelloModuleWorld {

	  public String sayHelloWorld() {

	      return "Hello Module World!";
	  }
	  
}
