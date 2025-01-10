package com.corejava.java17;

/*
Sealed classes and interfaces restrict which other classes or interfaces
may extend or implement them.
 */
public sealed interface SealedInterface permits MySubClass {
}
