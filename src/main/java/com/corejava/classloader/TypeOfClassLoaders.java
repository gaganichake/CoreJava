package com.corejava.classloader;

import java.sql.DriverManager;
import java.util.ArrayList;

public class TypeOfClassLoaders {

    public static void main(String[] args) throws Exception {
        printClassLoaders();
    }


    public static void printClassLoaders() throws ClassNotFoundException {

        // Bootstrap class loader
        // This bootstrap class loader is part of the core JVM and is written in native code
        // It’s mainly responsible for loading JDK internal classes, typically rt.jar and other
        // core libraries located in the $JAVA_HOME/jre/lib directory.

        // Additionally, the Bootstrap class loader serves as the parent of all the other ClassLoader instances.
        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());


        // The extension class loader is a child of the bootstrap class loader, and takes care
        // of loading the extensions of the standard core Java classes so that they’re available
        // to all applications running on the platform.

        // The extension class loader loads from the JDK extensions directory, usually the $JAVA_HOME/lib/ext
        // directory, or any other directory mentioned in the java.ext.dirs system property.
        System.out.println("Classloader of DriverManager:"
                + DriverManager.class.getClassLoader());

        // System Class Loader
        // The system or application class loader, on the other hand, takes care of loading all
        // the application level classes into the JVM. It loads files found in the classpath environment
        // variable, -classpath, or -cp command line option. It’s also a child of the extensions class loader.
        System.out.println("Classloader of this class:"
                + TypeOfClassLoaders.class.getClassLoader());
    }
}
